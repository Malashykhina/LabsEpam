package Reverse2;
public class Reverse {
//2. �������� �����, ������� ���������� �����, ���������� �������� (��� ������������� ����� �
//��������) (������: �� ����� 123, �� ������ 321)
	public static int doReverse(int number){
		int result=0;
		do{
			result=result*10+(number%10);
			number=number/10;
			}while(number!=0);
		return result;
	}
}