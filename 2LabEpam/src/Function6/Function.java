package Function6;
import java.lang.Math.*;
/**@autor=Ann*/
/**@version=1.0*/
/**Class counts y=log2(x-4)+exp(2a-x)*/
public class Function{
	/**countFunction counts y=log2(x-4)+exp(2a-x)*/
	/**@param x type integer, must be >4
	@param a type integer
	@return result of y=log2(x-4)+exp(2a-x)
	if x <=4 returns -1 and sais there is error
	*/
	public static double countFunction(int x,int a){
	double y;
	if((x-4)<=0)
	{ throw new LogarithmException("X must be grater than 4, logathithm can be taken from positive value");}
	else{
	y=Math.log10(x-4)/Math.log10(2)+Math.pow(Math.E,(2*a-x));
	return y;
	}
	}
}
