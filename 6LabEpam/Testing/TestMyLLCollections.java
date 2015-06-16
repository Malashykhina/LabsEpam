package Testing;

import MyCollections.MyCollections;
import MyLnkedList.MyLinkedList;

public class TestMyLLCollections {
	public static void main(String[] args){
		MyLinkedList l=new MyLinkedList();
		l.add(0,new Integer(21));
		l.addFirst(new Integer(7));
		l.addFirst(new Integer(6));
		l.addFirst(new Integer(7));
		l.addFirst(new Integer(8));
		l.addLast(new Integer(1));
		l.add(4,new Integer(3));
		System.out.println(l);
		
		MyLinkedList copyC=new MyLinkedList();//=null;
		copyC.add(new Integer(95));
		MyCollections.copy(copyC,l);
		System.out.println("copy="+copyC);
		
		MyCollections.reverse(l);
		System.out.println("reverse="+l);
		
		MyCollections.swap(l, 0, l.size()-1);
		System.out.println(l);
		
		MyCollections.swap(l, 2, 3);
		System.out.println(l);
				
		MyCollections.sort(l);
		System.out.println(l);
		
		 l=new MyLinkedList();
		 l.addFirst(new Integer(1));
		 l.addFirst(new Integer(2));
	     l.addFirst(new Integer(3));
		 l.addFirst(new Integer(4));
		 l.addFirst(new Integer(5));
		 l.addFirst(new Integer(6));
		 l.addFirst(new Integer(7));
		 l.addFirst(new Integer(8));
			System.out.println(l);
			MyCollections.sort(l);
			System.out.println(l);
		
			 l=new MyLinkedList();
			 l.addFirst(new Integer(5));
			 l.addFirst(new Integer(4));
		     l.addFirst(new Integer(3));
		     l.addFirst(new Integer(2));
				System.out.println(l);
				MyCollections.sort(l);
				System.out.println(l);MyCollections.reverse(l);
				System.out.println("reverse="+l);

				 l=new MyLinkedList();
				 l.addFirst(new Integer(5));
					System.out.println(l);
					MyCollections.sort(l);
					System.out.println(l);
					MyCollections.reverse(l);
					System.out.println("reverse="+l);
		}
}
