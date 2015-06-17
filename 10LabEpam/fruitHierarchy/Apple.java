package fruitHierarchy;

public class Apple extends Fruit {

	public Apple(int val) {
		super(val);}
	@Override
	public String toString(){
		return "Apple value ="+ getValue();
	}

}
