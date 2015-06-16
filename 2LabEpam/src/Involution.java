public class Involution {
//3. Написать метод, который возводит число x в степень n через рекурсию
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
	
	private double doInvolution1(int x, int n, double result){
	if (n==0) 
		return result;
	else{	
	//System.out.println("x="+x+ " n="+n +"result="+result);
	result=x*doInvolution1(x,n-1,result);
	//System.out.println("----x="+x+ " n="+n +"result="+result);
	return result;
	}	
	}
	public static void main(String[] args) {
	Involution i=new Involution();
    System.out.println(i.doInvolution(2, 3));
	System.out.println(i.doInvolution(2, -3));
	System.out.println(i.doInvolution(3, -3));
	System.out.println(i.doInvolution(2, 0));
  }
}