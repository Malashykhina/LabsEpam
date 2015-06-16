package NumberOfDigits1;
public class NumberOfDigitsTest{
	  public static void main(String[] args) {
		  int[] testArray={150, 0, 1, 99, -5, -99};
		  for (int i = 0; i < testArray.length; i++){
			  System.out.println("Number of ditgits in numer " + testArray[i] + " is " + NumberOfDigits.countNumberOfDigits(testArray[i]));
		  }
	}
}