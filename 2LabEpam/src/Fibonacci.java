public class Fibonacci {
//5. Ќаписать вычисление n-того по счету числа ‘ибоначчи через рекурсию f0 = f1 = 1, f (n) = f (nЦ1) + f(nЦ2). ++
/*
»ногда числа ‘ибоначчи рассматривают и дл€ отрицательных номеров n как двусторонне 
бесконечную последовательность, удовлетвор€ющую тому же рекуррентному соотношению. 
ѕри этом члены с отрицательными индексами легко получить с помощью эквивалентной 
формулы Ђназадї: F_n=F_{n+2}-F_{n+1}
n	-10	-9	-8	-7	-6	-5	-4	-3	-2	-1	0	1	2	3	4	5	6	7	8	9	10
F_n	-55	34	-21	13	-8	5	-3	2	-1	1	0	1	1	2	3	5	8	13	21	34	55
*/
	private int countFibonacci(int n){
	if (n==0) 
		return 0;
	else{	
		if (n==1){
			return 1;
		}
		else{
		if(n>0)
		return countFibonacci(n-1)+countFibonacci(n-2);
		else return countFibonacci(n+2)-countFibonacci(n+1);
		}
	}	
	}
	public static void main(String[] args) {
	Fibonacci i=new Fibonacci();
	for(int t=-4;t<10;t++){
		System.out.println(i.countFibonacci(t));
	}
  }
}
