package Permutation7;
public class Permutation{
//7*. Написать программу, которая выводит все комбинации перестановок чисел от 1 до заданного n.
//Все задания реализуются без использования массивов, списков, строк. 
//Необходимо использовать for,while, if
  public void doPermutation(int n){
	for(int k=0;k<n;k++)
	for(int i=1;i<=n;i++){
		int i1=i+k;
		if(i1>n)
			i1=(i1%n);
		System.out.print("("+i1);
		for(int j=1;j<=n;j++){
			int j1=j+k;
			if(j1>n)
			j1=(j1%n);
			if(i1!=j1)
			System.out.print(","+j1);
		}
		System.out.println(")");
		}	
	}
	
	/*private void doPermutation1(int n1, int n2){
	if (n1==n2) {
		System.out.println(", "+n2+")");
		System.out.print("(");
		}
	else{	
	System.out.print(n1+"-");
	for(int i=n1+1;i<=n2;i++)
	for(int j=i;j<=n2;j++){
		doPermutation1( i, j);
		}
	}	
	}*/
	
	public static void main(String[] args) {
	Permutation i=new Permutation();
	i.doPermutation(5);
  }
}
