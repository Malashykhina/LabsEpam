package enums;
import java.util.Date;


public enum CardDayType {DayOff{
	public boolean allowPass(Date day){
		if ((day.getDay()==6)||(day.getDay()==0)){
			//getDay() returns 6 for saturday and 0 for sunday
			return true;
		}
		else{return false;}
	}
}, 
	WeekDay{
	public boolean allowPass(Date day){
	if ((day.getDay()==6)||(day.getDay()==0)){
		return false;
		}
		else{return true;}
	}
};

public abstract boolean allowPass(Date day);
}
