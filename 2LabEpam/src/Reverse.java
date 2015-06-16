public class Reverse {
//2. Ќаписать метод, который возвращает число, записанное наоборот (без использовани€ строк и
//массивов) (пример: на входе 123, на выходе 321)
	public static int doReverse(int number){
		int result=0;
		while((number)>=1){
		result=result*10+(number%10);
		number=number/10;
		}
		return result;
	}
  public static void main(String[] args) {
  int n=150;
	int n1=0;
	int n2=123;
	int n3=99;
	int n4=11;
    System.out.println("Reverse of " + n + " is " +doReverse(n));
	System.out.println("Reverse of " + n1 + " is " +doReverse(n1));
	System.out.println("Reverse of " + n2 + " is " +doReverse(n2));
	System.out.println("Reverse of " + n3 + " is " +doReverse(n3));
	System.out.println("Reverse of " + n4 + " is " +doReverse(n4));
  }
}