package SystemAndTurnstile;

import java.util.Date;

import enums.CardTypes;

import TypesOfSkiPass.SkiPassParent;

public class StatisticsType {
	SkiPassParent s;
	Date day;
	boolean passAvailable; 
	CardTypes type;
	public StatisticsType(SkiPassParent s1, Date day1, boolean passAvailable1){
		s=s1;
		day=day1;
		passAvailable=passAvailable1;
		type = s.typeOfCard();
	}
	
	public SkiPassParent getSkiPassParent(){
		return s;
	}
	public Date getDay(){
		return day;
	}
	public CardTypes getType (){
		return type;
	}
	public boolean getPassAvailable (){
		return passAvailable;
	}
}
