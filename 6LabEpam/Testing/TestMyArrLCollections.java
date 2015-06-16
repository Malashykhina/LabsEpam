package Testing;
import MyArrayList.MyArrayList;
import MyCollections.MyCollections;

public class TestMyArrLCollections {
		public static void main(String[] args){
			MyArrayList l =new MyArrayList();			
			Object[] arr={new Integer(1),new Integer(9),new Integer(5),
					new Integer(20),new Integer(0)};
			l.addAll(arr);
			System.out.println(l);
			
			MyCollections.sort(l);
			System.out.println(l);
			
			MyArrayList copyC =new MyArrayList();
			MyCollections.copy(copyC,l);
			System.out.println("copy="+copyC);
			
			MyCollections.reverse(l);
			System.out.println("reverse="+l);
			
			MyCollections.swap(l, 0, 1);
			System.out.println(l);
	

			System.out.println(MyCollections.binarySearch(l, 20));
			System.out.println(MyCollections.binarySearch(l, 200));
			}		
	}
