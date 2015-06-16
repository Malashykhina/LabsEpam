package MyCollections;

import java.util.Comparator;

import Interfaces.MyList;
import Interfaces.RandomAccess;
import MyArrayList.MyArrayList;
import MyLnkedList.MyLinkedList;

public class MyCollections {
	public static void sort(MyList list){
		if (list instanceof RandomAccess){
			qSort((MyArrayList)list,0,list.size()-1);
		}else bubbleSort((MyLinkedList)list);
	}
	public static void sort(MyList list,Comparator c){
		if (list instanceof RandomAccess){
			qSort((MyArrayList)list,0,list.size()-1,c);
		}else bubbleSort((MyLinkedList)list,c);
	}
	private static void bubbleSort(MyLinkedList list){
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size()-1-i;j++){
				Integer a=list.get(j);
				Integer b=list.get(j+1);
				if (a.compareTo(b)>0){
					swap(list,j,j+1);
				}
			}	
		}
	}
	
	private static void bubbleSort(MyLinkedList list,Comparator c){
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size()-1-i;j++){
				Integer a=list.get(j);
				Integer b=list.get(j+1);
				if (c.compare(a, b)>0){
					swap(list,j,j+1);
				}
			}	
		}
	}
	
	/*Swaps the elements at the specified positions in the
	 specified list*/
	public static void swap(MyList list, int i, int j){
		Integer a=(Integer)list.get(i);
		Integer b=(Integer)list.get(j);
		list.set(i, b);
		list.set(j, a);
	}
	
	/*Copies all of the elements from one list into	another*/
	public static void copy(MyList dest, MyList src){
		for(int j=0;j<src.size();j++){
			dest.add(src.get(j));

		}	
	}

	/*Reverses the order of the elements in the specified list*/
	public static void reverse(MyList list){
		for (int i=0;i<(list.size()/2);i++){
			swap(list, i, list.size()-1-i);
		}
	}

	private static void qSort(MyArrayList list,int leftBorder,int rightBorder,Comparator c){
		if(leftBorder<rightBorder){
			int p=partition(list,leftBorder,rightBorder,c);
			qSort(list,leftBorder,p-1);
			qSort(list,p+1,rightBorder);
		}
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
			if(((Integer)list.get(i)).compareTo(pivotValue)<=0){
				swap(list,i,wallIndex);
				wallIndex++;
			}
		}
		swap(list,rightBorder,wallIndex);
		return wallIndex;
	}
	
	private static int partition(MyArrayList list,int leftBorder,int rightBorder,
			Comparator c){
		Integer pivotValue=(Integer)list.get(rightBorder);
		int wallIndex=leftBorder;
		
		for(int i=leftBorder;i<rightBorder;i++){
			if(c.compare((Integer)list.get(i), pivotValue)<=0){
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


}
