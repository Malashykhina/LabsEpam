package mergesort;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	int[]arr=new int[]{1, 9,8,2 ,5,6,7,11, 95,18,12 ,45,16,87};
    	//int[]arr=new int[]{1, 9,8,2 ,5,6};
    	MergesortRec m=new MergesortRec(arr);
    	Thread th=new Thread(m);
  	 	th.start();
    	th.join();
    	for(int i=0;i<m.numbers.length;i++){
    		System.out.println(m.numbers[i]);
    	}
    }
}

