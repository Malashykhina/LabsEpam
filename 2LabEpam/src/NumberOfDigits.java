public class NumberOfDigits{
//1. Написать метод, который подсчитывает количество цифр в числе
	public  static int countNumberOfDigits(int number){
		int result=1;
		while((number)>=10){
		number=number/10;
		result++;
		}
		return result;
	}
  public static void main(String[] args) {
	int n=150;
	int n1=0;
	int n2=123;
	int n3=99;
    System.out.println("Number of ditgits in numer " + n + " is " +countNumberOfDigits(n));
	System.out.println("Number of ditgits in numer " + n1 + " is " +countNumberOfDigits(n1));
	System.out.println("Number of ditgits in numer " + n2 + " is " +countNumberOfDigits(n2));
	System.out.println("Number of ditgits in numer " + n3 + " is " +countNumberOfDigits(n3));
  }
}