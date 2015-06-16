package Involution3;
public class InvolutionTest {
	public static void main(String[] args) {
		int testArray[][]={
				{2, 3},
				{2, -3},
				{3, -3},
				{2, 0},
				{-2, 3},
				{-2, -2},
		};
	Involution involutionObj =new Involution();
	for (int i=0; i <testArray.length; i++ ){
    System.out.println(testArray[i][0]+"^"+ testArray[i][1]+"="+ involutionObj.doInvolution(testArray[i][0], testArray[i][1]));
	}
  }
}