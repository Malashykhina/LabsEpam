package MyArrayList;
public class MyArrayList {
	private final static int DEFAULT_LENGTH=10;
	private Object[] privateArray;
	private int arraySize=0;//number of added elements

	public MyArrayList(int initialCapacity){
		this.privateArray=new Object[initialCapacity];	//Constructs an empty list with the specified initial capacity
	}
	public MyArrayList(){
		this(DEFAULT_LENGTH);//Constructs an empty list with an initial capacity of ten (10)
		}

	/*вставляет элемент в конец списка.В случае если начального 
	размера массива становится недостаточно, то массив
	автоматически должен вырасти, что бы вместить все данные.*/
	public void add(Object e){
		ensureCapacity(++arraySize);
		this.privateArray[arraySize-1]=e;
	}
	
	/*вставляет элемент на указанную позицию, сдвигая остальные
	элементы*/
	public void add(int index, Object element){
		checkIndexForInsert(index);
		ensureCapacity(arraySize+1);
		
		Object[] tempArr=new Object[arraySize+1];
		System.arraycopy(privateArray, 0, tempArr, 0, index);
		/*for(int i=0;i<index;i++){
			tempArr[i]=this.privateArray[i];
		}*/
		tempArr[index]=element;
		System.arraycopy(privateArray, index, tempArr, index+1, arraySize-index);
		/*	for(int i=index;i<this.arraySize;i++){
			tempArr[i+1]=this.privateArray[i];
		}*/
		this.privateArray=tempArr;
		arraySize++;
	}
	
	/*Appends all of the elements to the end of this list*/
	public void addAll(Object[] c){
		addAll(this.arraySize, c);
	}
	
	/*Inserts all of the elements into this list, 
	starting at the specified position*/
	public void addAll(int index, Object[] c){
		checkIndexForInsert(index);
		int newArraySize=arraySize+c.length;
		ensureCapacity(newArraySize);
		
		Object[] tempArr=new Object[newArraySize];		
		System.arraycopy(privateArray, 0, tempArr, 0, index);
		System.arraycopy(c, 0, tempArr, index, c.length);
		System.arraycopy(privateArray, index, tempArr, index+c.length, arraySize-index);
		/* for(int i=0;i<index;i++){
			tempArr[i]=this.privateArray[i];
		}
		for(int i=0;i<c.length;i++){
			tempArr[i+index]=c[i];
		}
		for(int i=index;i<arraySize;i++){
			tempArr[i+c.length]=this.privateArray[i];
		}*/
		this.privateArray=tempArr;
		arraySize=newArraySize;
		}
	/*Increases the capacity of this ArrayList instance, if necessary, to
	ensure that it can hold at least the number of elements specified 
	by the minimum capacity argument.	*/
	void ensureCapacity(int minCapacity){
		if(privateArray.length<minCapacity){
			Object[] tempArr=new Object[minCapacity];
			System.arraycopy(privateArray, 0, tempArr, 0, privateArray.length);
			/*	for(int i=0;i<this.privateArray.length;i++){
				tempArr[i]=this.privateArray[i];
			}*/
			this.privateArray=tempArr;
		}
	}
	
	public Object get(int index){
		checkIndex(index,arraySize-1);
		return this.privateArray[index];		
	}
	
	private void checkIndexForInsert(int i){
		//для set и remove значение должно быть (i<=arraySize-1), 
		//но добавлять можно и после масива, потому (i<=arraySize)
		checkIndex(i,arraySize);
	}
	private void checkIndex(int i,int lastEl){
		if (!((i==0)||((i>0)&&(i<=lastEl)))){
			throw new IndexOutOfBoundsException();		
		}
	}
	/*при удалении размер массива должен уменьшаться*/
	public Object remove(int index){
		checkIndex(index,arraySize-1);
		Object objToReturn=get(index);
		Object[] tempArr=new Object[arraySize-1];
				
		System.arraycopy(privateArray, 0, tempArr, 0, index);
		System.arraycopy(privateArray, index+1, tempArr, index, arraySize-index-1);
		/*for(int i=0;i<index;i++){
			tempArr[i]=this.privateArray[i];
		}
		for(int i=index+1;i<this.arraySize;i++){
			tempArr[i-1]=this.privateArray[i];
		}*/
		arraySize--;
		this.privateArray=tempArr;
		return objToReturn;
	}
	/*изменяет значение элемента*/
	public void set(int index, Object element){
		checkIndex(index,arraySize-1);
		this.privateArray[index]=element;
	}
	public int size(){
		return this.arraySize;
		/*размер списка*/
	}
	
	public String toString(){
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<this.arraySize;i++){
			sb.append(this.privateArray[i].toString());
			sb.append(' ');
		}
		return sb.toString();		
	}
}
