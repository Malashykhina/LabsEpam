package NumberOfDigits1;
public class NumberOfDigits{
//1. �������� �����, ������� ������������ ���������� ���� � �����
	public static int countNumberOfDigits(int number){
		int result=0;
		do{
		number=number/10;
		result++;
		}while(number!=0);
		return result;
	}

}