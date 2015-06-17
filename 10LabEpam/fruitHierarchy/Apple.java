package fruitHierarchy;

public class Apple extends Fruit {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Apple(int val){
		value=val;
	}
	public <T> int CompareTo(T obj) {
		return this.getValue()-((Apple) obj).getValue();
	}
	
	@Override
	public String toString(){
		return "Apple value ="+ getValue();
		
	}

}
