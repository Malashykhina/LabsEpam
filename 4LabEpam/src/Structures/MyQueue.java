package Structures;

public class MyQueue {
	private MyLinkedList arr;
	public void offer(Element e){
		if (arr==null){
			arr=new MyLinkedList();
		}
		arr.addLast(e.getValue());//? нет метода для element	
	}//добавить в конец очереди
	public Element peek(){
		return arr.getFirstElement();}//взять без удаления, элемент из очереди
	public Element poll(){
		Element tempEl=new Element();
		tempEl=arr.getFirstElement();
		arr.removeFirst();
		return tempEl;}//взять и удалить элемент из очереди
	
	public String toString(){
		return arr.toString();		
	}

}
