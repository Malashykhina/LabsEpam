package MyCollections;

import MyArrayList.MyArrayList;
import MyLnkedList.MyLinkedList;

public class MyCollections {
	public static void sort(MyLinkedList list){
		//Sorting in increasing order
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size()-1-i;j++){
				Integer a=list.get(j);
				Integer b=list.get(j+1);
				if (a>b){
					list.set(j, b);
					list.set(j+1, a);
				}
			}	
		}
	}
	
	/*Swaps the elements at the specified positions in the
	 specified list*/
	public static void swap(MyLinkedList list, int i, int j){
		Integer a=list.get(i);
		Integer b=list.get(j);
		list.set(i, b);
		list.set(j, a);
	}
	
	/*Copies all of the elements from one list into	another*/
	public static void copy(MyLinkedList dest, MyLinkedList src){
		for(int j=0;j<src.size();j++){
			dest.add(src.get(j));

		}	
	}

	/*Reverses the order of the elements in the specified list*/
	public static void reverse(MyLinkedList list){
		for (int i=0;i<(list.size()/2);i++){
			swap(list, i, list.size()-1-i);
		}
	}

	public static void sort(MyArrayList list){//quicksort
		//Sorting in increasing order
		qSort(list,0,list.size()-1);
			
	}
	private static void qSort(MyArrayList list,int leftBorder,int rightBorder){
		if(leftBorder<rightBorder){
			int p=partition(list,leftBorder,rightBorder);
			qSort(list,leftBorder,p-1);
			qSort(list,p+1,rightBorder);
		}
	}
	private static int partition(MyArrayList list,int leftBorder,int rightBorder){
		Integer pivotValue=(Integer)list.get(rightBorder);
		int wallIndex=leftBorder;
		
		for(int i=leftBorder;i<rightBorder;i++){
			if((Integer)list.get(i)<=pivotValue){
				swap(list,i,wallIndex);
				wallIndex++;
			}
		}
		swap(list,rightBorder,wallIndex);
		return wallIndex;
	}
	
	/*реализует рекурсивный поиск в отсортированном массиве
	 методом бисекции.
≈сли элемент найден, то возвращаетс€ его индекс. 
≈сли не найден, то возвращаетс€ отрицательное
значение, вычисл€емое по следующей формуле: 
(-(insertion point) - 1), где insertion point - индекс того
места в массиве, где должен был бы быть указанный элемент*/
	public static int binarySearch(MyArrayList list, Integer key){
		sort(list);
		int result=binarySearch(list, key,0,list.size()-1);
		return result;		
	}
	private static int binarySearch(MyArrayList list, Integer key, int leftBorder,int rightBorder ){
		int result;
		int middle = (leftBorder+rightBorder)/2;
		if (leftBorder>rightBorder){
			return -leftBorder-1;//leftBorder is insertion point
			}else{
				if (key.equals((Integer)list.get(middle))){
					result=middle;
					}else{
						if (key>(Integer)list.get(middle)){
							result=binarySearch(list, key,middle+1,rightBorder);
							}
						else{
							result=binarySearch(list, key,leftBorder,middle-1);
							}
						}
				}			
		return result;	 
	}
	/*Swaps the elements at the specified positions in the
	 specified list*/
	public static void swap(MyArrayList list, int i, int j){
		Object a=list.get(i);
		Object b=list.get(j);
		list.set(i, b);
		list.set(j, a);
	}
	
	/*Copies all of the elements from one list into	another*/
	public static void copy(MyArrayList dest, MyArrayList src){
		for(int j=0;j<src.size();j++){
			dest.add(src.get(j));

		}	
	}

	/*Reverses the order of the elements in the specified list*/
	public static void reverse(MyArrayList list){
		for (int i=0;i<(list.size()/2);i++){
			swap(list, i, list.size()-1-i);
		}
	}

}
