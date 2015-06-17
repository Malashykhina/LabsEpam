package fruitHierarchy;

public class Melon extends Fruit {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Melon(int val){
		value=val;
	}
	public <T> int CompareTo(T obj) {
		return this.getValue()-((Melon) obj).getValue();
	}

	@Override
	public String toString(){
		return "Melon value ="+getValue();
		
	}
}
