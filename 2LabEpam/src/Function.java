import java.lang.Math.*;
/**@autor=Ann*/
/**@version=1.0*/
/**Class counts y=log2(x-4)+exp(2a-x)*/
public class Function{
//6. Используя стандартную библиотеку java.lang.Math (), написать метод для вычисление ф-ции
//y=log2(x-4)+exp(2a-x), с проверками на область определения, а так же создать к нему JavaDoc
	/**countFunction counts y=log2(x-4)+exp(2a-x)*/
	/**@param x type integer, must be >4
	@param a type integer
	@return result of y=log2(x-4)+exp(2a-x)
	if x <=4 returns -1 and sais there is error
	*/
	public static double countFunction(int x,int a){
	double y;
	if((x-4)<=0){
	System.out.println("X must be grater than 4, logathithm can be taken from positive value");
	return -1;
	}
	else{
	y=Math.log10(x-4)/Math.log10(2)+Math.pow(Math.E,(2*a-x));
	return y;
	}
	}

	public static void main(String[] args) {
	System.out.println("countFunction(5,2)="+countFunction(5,2));
	System.out.println("countFunction(6,2)="+countFunction(6,2));
	System.out.println("countFunction(0,1)="+countFunction(0,1));
  }
}
