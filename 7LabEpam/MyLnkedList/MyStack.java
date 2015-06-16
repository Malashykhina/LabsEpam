package MyLnkedList;

import Interfaces.Stack;

public class MyStack implements Stack{
	private MyLinkedList arr;
	public void push(Element e){
		if (arr==null){
			arr=new MyLinkedList();
		}
		arr.addFirst(e.getValue());
	} //поместить элемент в стек
	public Element pop(){
		Element tempEl=new Element();
		tempEl=arr.getFirstElement();
		arr.removeFirst();
		return tempEl;
		}//взять элемент из стека
	
	public String toString(){
		return arr.toString();		
	}
	@Override
	public void push(Object e) {
		push((Element)e);
	}
}
