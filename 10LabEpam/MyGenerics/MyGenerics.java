package MyGenerics;
import java.util.Collection;

public class MyGenerics {
	static <T> void fromArrayToCollection(T [] a, Collection<T> c){
		for(int i=0;i<a.length;i++){
			c.add((T) a[i]);
		}
	}
	
	static <T> void copyAll(Collection<? extends T>  collection,  Collection <T> out){
		for(T var : collection){
			out.add((T) var);
		}
	}
	
	static <T extends Comparable<T>> void  allGreaterThan(Collection<T>  collection, T obj , Collection<T> outGr  ){
		for(T var : collection){
			if(var.compareTo(obj)>0){
				outGr.add((T) var);
			}
		}
	}
	
	static <T> String  printCollection(Collection<T>  collection){
		StringBuilder sb =new StringBuilder();
		for(T var : collection){
			sb.append(var.toString());
			sb.append(' ');
		}
		return sb.toString();
	}
}
