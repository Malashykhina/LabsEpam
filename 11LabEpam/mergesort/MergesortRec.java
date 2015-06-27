package mergesort;


class MergesortRec implements Runnable {
	public static volatile int [] numbers;
	int left;
	int right;
     public MergesortRec(int [] numbers, int left, int right) {
    	this.numbers=numbers;
    	this.left=left;
    	this.right=right;
     }
     public MergesortRec(int [] numbers) {
    	this.numbers=numbers;
    	this.left=0;
    	this.right=numbers.length-1;
     }

      public void run() { 
    	  sort(this.numbers,this.left,this.right);
      }
      private void sort(int [] numbers, int left, int right) {
     	 int mid;
      	  if (right > left)
            {
              mid = (left+right)/2;
              Thread th=new Thread(new MergesortRec(numbers, left,mid));
         	  th.start();
         	 
              Thread th2=new Thread(new MergesortRec(numbers, (mid + 1), right));
              th2.start();
              
              Merge(numbers, left, (mid+1), right);
            }
      }
      
      private void Merge(int [] numbers, int left, int mid, int right)
      {
        int [] temp = new int[numbers.length];
        int i;
        int leftEnd;
        int numOfElements;
        int tmpPos;
    
        leftEnd = (mid - 1);
        tmpPos = left;
        numOfElements = (right - left + 1);
    
        while ((left <= leftEnd) && (mid <= right))
        {
            if (numbers[left] <= numbers[mid])
                temp[tmpPos++] = numbers[left++];
            else
                temp[tmpPos++] = numbers[mid++];
        }
    
        while (left <= leftEnd)
            temp[tmpPos++] = numbers[left++];
 
        while (mid <= right)
            temp[tmpPos++] = numbers[mid++];
 
        for (i = 0; i < numOfElements; i++)
        {
            numbers[right] = temp[right];
            right--;
        }
    }
}
