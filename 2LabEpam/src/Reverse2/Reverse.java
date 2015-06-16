package Reverse2;
public class Reverse {
//2. Ќаписать метод, который возвращает число, записанное наоборот (без использовани€ строк и
//массивов) (пример: на входе 123, на выходе 321)
	public static int doReverse(int number){
		int result=0;
		do{
			result=result*10+(number%10);
			number=number/10;
			}while(number!=0);
		return result;
	}
}