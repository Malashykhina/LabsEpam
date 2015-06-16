package MyLnkedList;

import Interfaces.MyList;

public class MyLinkedList implements MyList{
	private Element myElement;
	private int sizeOfList;
	
	public void add(Integer e){
		this.addLast(e);
	}// вставляет элемент в конец списка
	
	private void checkIndex(int i){
		if (!((i>=0)&&(i<=sizeOfList))){
			throw new IndexOutOfBoundsException();		
		}
	}
	
	public void add(int index, Integer element) {
		checkIndex(index);
		if (index==0){
			addFirst(element);
		}else{
			Element tempElBeforeInsert=this.getElementById(index-1);
			Element newElToInsert=new Element();
			newElToInsert.setElement(element, tempElBeforeInsert.next());
			tempElBeforeInsert.setElement(tempElBeforeInsert.getValue(), newElToInsert);
			sizeOfList++;
			}
	}//вставляет элемент на указанную позицию, сдвигая остальные элементы
	
	public void addFirst(Integer e){
		if (myElement==null){
		myElement=new Element();
		myElement.setElement(e, null);
		}
		else{
			Element newHead=new Element();
			newHead.setElement(e, myElement);
			myElement=newHead;
		}
		sizeOfList++;
	}
	
	public void addLast(Integer e){
		if (myElement==null){
			this.addFirst(e);
		}
		else{
			this.add(this.sizeOfList, e);
			}
		}
	
	public Integer get(int index){
		int i=0;
		Element tempEl=new Element();
		tempEl=myElement;
		while((i<index)&&(tempEl!=null)){
			tempEl=tempEl.next();
			i++;			
		}	
		if (i==index) return tempEl.getValue();
		else
		return null;
		}
	
	public Integer getFirst(){
		return get(0);}
	
	public Integer getLast(){
		return get(sizeOfList-1);}
	
	private Element getElementById(int index){//added to avoid copy-pasting
		checkIndex(index);
		int i=0;
		Element tempEl=myElement;
		while(i<index){
			tempEl=tempEl.next();
			i++;			
		}	
		return tempEl;
	}
	
	public Element getFirstElement(){//for Queue and Stack
		Element tempEl=myElement;
		return tempEl;
		}
	
	public Integer remove(int index){
		checkIndex(index);
		if (index==0){
			return this.removeFirst();
		}
		else{
			Element parent=this.getElementById(index-1);
			Element elToRemove=parent.next();

			parent.setElement(parent.getValue(), elToRemove.next());
			sizeOfList--;
			return elToRemove.getValue();	
			}
		}
	
	public Integer removeFirst(){
		Element parent=null;
		if (myElement==null){
			return null;
		}else 
			parent=myElement;
			myElement=myElement.next();
			sizeOfList--;
			if(myElement==null){
			return null;
			}
			else{
				return parent.getValue();
			}
		}
	
	public Integer removeLast(){
		return remove(sizeOfList-1);}
	
	public void set(int index, Integer element){	
		checkIndex(index);
		Element tempEl=this.getElementById(index);
		tempEl.setElement(element);
	}// изменяет значение элемента
	
	public int size(){//размер списка
		return sizeOfList;
		}
	
	public int indexOf(Integer o){
		int i=0;
		Element tempEl=new Element();
		tempEl=myElement;
		while((i<sizeOfList)&&(tempEl!=null)){
			if (o.equals(tempEl.getValue())){
				return i;
			}
			tempEl=tempEl.next();
			i++;			
		}	
		return -1;}//поиск индекса по значению
	
	public String toString(){
		StringBuilder sb =new StringBuilder();
		
		int i=0;
		Element tempEl=new Element();
		tempEl=myElement;
		while((i<sizeOfList)&&(tempEl!=null)){
			sb.append(tempEl.getValue());
			sb.append(' ');
			tempEl=tempEl.next();
			i++;			
		}
		return sb.toString();		
	}
	//проверки на индексы, StringBuilder,вынести код

	@Override
	public void add(Object e) {
		add((Integer)e);
	}

	@Override
	public void add(int index, Object element) {
		add(index,(Integer)element);		
	}

	@Override
	public void addAll(Object[] c) {
		for(int i=0;i<c.length;i++){
			add(c[i]);
		}
	}

	@Override
	public void addAll(int index, Object[] c) {
		for(int i=0; i<c.length;i++){
			add(index+i,c[i]);
		}
	}

	@Override
	public void set(int index, Object element) {
		set(index,(Integer)element);
	}

	@Override
	public int indexOf(Object o) {
		return indexOf((Integer)o);
	}

	@Override
	public Object[] toArray() {
		Object[] result=new Object[sizeOfList];
		Element tempEl=	myElement;
		for(int i=0; i<sizeOfList;i++){
			result[i]=tempEl.getValue();
			tempEl=tempEl.next();
		}
		return result;
	}

}
