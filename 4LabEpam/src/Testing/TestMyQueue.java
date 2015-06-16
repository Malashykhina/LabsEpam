package Testing;
import Structures.Element;
import Structures.MyQueue;


public class TestMyQueue {
	public static void main(String[] args){
		MyQueue mQ=new MyQueue();
		for (int i=0; i<9;i++){
		Element tempEl=new Element();
		tempEl.setElement(new Integer(i));
		mQ.offer(tempEl);
		System.out.println(mQ);
		}
		/**/System.out.println(mQ);
		System.out.println(mQ.poll().getValue());
		System.out.println(mQ);
		
		System.out.println(mQ.peek().getValue());
		System.out.println(mQ);
		
		for (int i=0; i<8;i++){
		System.out.println(mQ.poll().getValue());
		System.out.println(mQ);
		}
		}
}
