package Testing;
import Structures.MyLinkedList;


public class TestMyLinkedList {
	public static void main(String[] args){
		MyLinkedList l=new MyLinkedList();
		l.add(0,new Integer(2));
		l.addFirst(new Integer(5));
		l.addFirst(new Integer(6));
		l.addFirst(new Integer(7));
		l.addFirst(new Integer(8));
		l.addLast(new Integer(1));
		l.add(4,new Integer(3));
		System.out.println(l);
		
		System.out.println(l.indexOf(2));
		System.out.println(l.indexOf(8));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.set(1, 9);
		System.out.println(l);

		l.remove(0);
		System.out.println(l);
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		}
}
