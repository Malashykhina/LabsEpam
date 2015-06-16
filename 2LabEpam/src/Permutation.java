public class Permutation{
//7*. Написать программу, которая выводит все комбинации перестановок чисел от 1 до заданного n.
//Все задания реализуются без использования массивов, списков, строк. 
//Необходимо использовать for,while, if
  public void doPermutation(int n){
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
			arr[i]=i;
			}  
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++){
			int[] arr1=shift(arr, i, j);
		System.out.print("shift of ("+i+","+j+")=");
		for(int t=0;t<arr1.length;t++)System.out.print(arr1[t]);
		System.out.println();
		}
	
	}
	
	private int[] shift(int[] array, int place, int shiftQuantity){

		for(int i=0;i<shiftQuantity;i++){
			int tempVar=array[place];
			for(int j=place;j<array.length-1;j++){
				array[place]=array[place+1];		
			}
			array[array.length-1]=tempVar;
		}
		//arraycopy
		//arrayshit
		//call for others
	return array;
	}	
	
	public static void main(String[] args) {
	Permutation i=new Permutation();
	i.doPermutation(4);
  }
}
