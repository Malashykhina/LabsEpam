package MyGenerics;
import java.util.ArrayList;
import java.util.List;

import fruitHierarchy.Apple;
import fruitHierarchy.Fruit;
import fruitHierarchy.Melon;
import fruitHierarchy.Orange;
import fruitHierarchy.RedApple;

public class TestMyGenerics {
		public static void main(String[] args){
			List<Fruit> fr = new ArrayList <Fruit>();
			List<Apple> app = new ArrayList <Apple>();
			List<Orange> or = new ArrayList <Orange>();
			List<RedApple> rapp = new ArrayList <RedApple>();
			List<Melon> mel = new ArrayList <Melon>();
			MyGenerics.copyAll(or, fr);
			MyGenerics.copyAll(rapp, fr);
			MyGenerics.copyAll(rapp, app);
			MyGenerics.copyAll(rapp, rapp);
			MyGenerics.copyAll(mel, fr);
			//MyGenerics.copyAll(fr, or);	
			
			List<Apple> outGr= new ArrayList <Apple>();
			app.add(new Apple(5));
			app.add(new Apple(3));
			app.add(new Apple(1));
			app.add(new Apple(8));
			MyGenerics.allGreaterThan(app, new Apple(4), outGr);
			
			System.out.println(MyGenerics.printCollection(outGr));
			
		}
	}
