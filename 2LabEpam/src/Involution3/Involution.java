package Involution3;
public class Involution {
//3. Написать метод, который возводит число x в степень n через рекурсию
	//main method doInvolution puts x into n  degree
	public double doInvolution(int x, int n){
	double result=1;
	boolean negative=false;
	if(n<0) {
		negative=true;
		n=-n;
		}
	if (n==0) 
		return result;
	else{
		result=doInvolution1( x,  n, result);
		if(negative)
			result=1/result;
		return result;
	}	
	}
	
	//method doInvolution1 puts x into positive degree n 
	private double doInvolution1(int x, int n, double result){
	if (n==0) 
		return result;
	else{
	result=x*doInvolution1(x,n-1,result);
	return result;
	}	
	}
}