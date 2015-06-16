package Fibonacci5;
public class Fibonacci {
	public int countFibonacci(int n){
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
}
