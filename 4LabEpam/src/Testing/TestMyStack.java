package Testing;
import Structures.Element;
import Structures.MyStack;


public class TestMyStack {
	public static void main(String[] args){
		MyStack mS=new MyStack();
		for (int i=0; i<9;i++){
		Element tempEl=new Element();
		tempEl.setElement(new Integer(i));
		mS.push(tempEl);
		System.out.println(mS);
		}
		
		System.out.println(); 
		
		for (int i=0; i<9;i++){
		System.out.println(mS.pop().getValue());
		System.out.println(mS);
		}
		}
}
