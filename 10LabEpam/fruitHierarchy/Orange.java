package fruitHierarchy;

public class Orange extends Fruit {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Orange(int val){
		value=val;
	}
	public <T> int CompareTo(T obj) {
		return this.getValue()-((Orange) obj).getValue();
	}

	@Override
	public String toString(){
		return "Orange value ="+getValue();
		
	}
}
