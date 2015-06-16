package MyLnkedList;

import Interfaces.Queue;

public class MyQueue implements Queue{
	private MyLinkedList arr;
	public void offer(Element e){
		if (arr==null){
			arr=new MyLinkedList();
		}
		arr.addLast(e.getValue());//? ��� ������ ��� element	
	}//�������� � ����� �������
	public Element peek(){
		return arr.getFirstElement();}//����� ��� ��������, ������� �� �������
	public Element poll(){
		Element tempEl=new Element();
		tempEl=arr.getFirstElement();
		arr.removeFirst();
		return tempEl;}//����� � ������� ������� �� �������
	
	public String toString(){
		return arr.toString();		
	}
	@Override
	public void offer(Object e) {
		offer((Element) e);
	}

}
