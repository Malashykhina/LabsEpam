package Factorial4;
public class Factorial {
//4. Написать вычисление факториала числа n через рекурсию ++
	public int countFactorial(int n){
		if(n>=0){
			if ((n==0)||(n==1))
				return 1;
			else return n*countFactorial(n-1);
		}
		else{
			return -1;
		    }
		}
}
