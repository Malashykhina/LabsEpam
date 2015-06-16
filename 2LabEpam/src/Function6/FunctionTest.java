package Function6;
public class FunctionTest{
	public static void main(String[] args) {
		int testArray[][]={
				{5, 2},
				{6, 2},
				{0, 1},
				{2, 0},
				{-1, 1},
				{5, -2},
		};
	for (int i=0; i <testArray.length; i++ ){
		try{
    System.out.println("countFunction("+testArray[i][0]+","+testArray[i][1]+")="+Function.countFunction(testArray[i][0],testArray[i][1]));
		}catch(LogarithmException e){System.out.println(e);}
		finally{continue;}
	}
  }
}
