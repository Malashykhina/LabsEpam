package fruitHierarchy;

public class RedApple extends Apple {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public RedApple(int val){
		super(val);
		value=val;
	}
	public <T> int CompareTo(T obj) {
		return this.getValue()-((RedApple) obj).getValue();
	}
}
