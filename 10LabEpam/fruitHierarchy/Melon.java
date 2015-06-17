package fruitHierarchy;

public class Melon extends Fruit {
	
	public Melon(int val) {
		super(val);
		}

	@Override
	public String toString(){
		return "Melon value ="+getValue();
		
	}
}
