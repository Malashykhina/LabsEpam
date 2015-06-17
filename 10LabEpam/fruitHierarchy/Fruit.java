package fruitHierarchy;

public class Fruit implements Comparable {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Fruit(int val){
		value=val;
	}

	public int compareTo(Object obj) {
		return this.getValue()-((Fruit) obj).getValue();
	}

}
