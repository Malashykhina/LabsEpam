package Reverse2;
public class ReverseTest{
	  public static void main(String[] args) {
		  //? ����� �� ������ ��������� ��� �����, ������� ������������� �� ����
		  int[] testArray={150, 0, 1, 97, -5, -54};
		  for (int i = 0; i < testArray.length; i++){
			  System.out.println("Reverse of " + testArray[i] + " is " + Reverse.doReverse(testArray[i]));
		  }
	}
}