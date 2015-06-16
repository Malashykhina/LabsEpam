public class Permutation2{
//7*. Написать программу, которая выводит все комбинации перестановок чисел от 1 до заданного n.
//Все задания реализуются без использования массивов, списков, строк. 
//Необходимо использовать for,while, if

  public void doPermutation(int n){
	for(int i=1; i<=n; i++){
		System.out.print("(");
		doPermutation1( i, n);
		System.out.println(")");
		}
	}	
	
	private void doPermutation1(int place, int number){
	if (number==0) {
		System.out.println("00");
		}
	else{
	System.out.print(";;");
	for(int i=1; i<number; i++){
		if (i==place){
		System.out.print(number+",");
		}else
		doPermutation1( i, number-1);
		}
	}	
	System.out.println("place"+place+" ;number"+number);
	}
	
	public static void main(String[] args) {
	Permutation2 i=new Permutation2();
	i.doPermutation(4);
  }
}
