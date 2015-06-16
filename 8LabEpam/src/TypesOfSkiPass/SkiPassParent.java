package TypesOfSkiPass;
import java.util.Date;

import enums.CardTypes;

public abstract class SkiPassParent{
	public abstract boolean IsPassAvailable(Date day);
	public abstract  CardTypes typeOfCard();
	protected static int IdForNextObj=0;
	protected int ID;

	SkiPassParent(){
		setID();
	}
	public void setID() {
		ID = IdForNextObj;
		IdForNextObj++;
	}
	public int getID(){
		return ID;
	}
}
