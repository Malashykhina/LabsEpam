package fruitHierarchy;

public class Orange extends Fruit {
	
	public Orange(int val) {
		super(val);
		}

	@Override
	public String toString(){
		return "Orange value ="+getValue();
		
	}
}
