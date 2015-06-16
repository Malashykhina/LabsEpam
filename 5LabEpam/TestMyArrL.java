public class TestMyArrL {
		public static void main(String[] args){
			MyArrayList l =new MyArrayList();
			l.size();
			
			l.add(0,new Integer(2));
			System.out.println(l);
			
			l.add(new Integer(3));
			System.out.println(l);
			
			/*l.add(new Integer(5));
			System.out.println(l);
			
			l.add(0,new Integer(21));
			System.out.println(l);
			
			l.add(4,new Integer(8));
			System.out.println(l);
			*/
			l.set(1, 9);
			System.out.println(l);

			l.remove(1);
			System.out.println(l);
			
			//l.remove(0);
			//System.out.println(l);
			
			Object[] arr={new Integer(25),new Integer(23),new Integer(12),
					new Integer(15),new Integer(19)};

			l.addAll(0,arr);
			System.out.println(l);
			
			l.addAll(arr);
			System.out.println(l);
				
			l.remove(3);
			System.out.println(l);
			
			l.remove(4);
			System.out.println(l);
			
			l.add(3,new Integer(99));
			System.out.println(l);
			}
	}
