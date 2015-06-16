package TypesOfSkiPass;
import java.util.Date;

import enums.CardDayType;
import enums.CardTypes;
import enums.NumberOfLiftsType;


public class SkiPassByNumberOfLifts extends SkiPassParent{
	private NumberOfLiftsType numberOfLifts;
	private CardDayType cardByDayOfWeek;
	private CardTypes type = CardTypes.BY_NUMBER_OF_LIFTS;
	
	public SkiPassByNumberOfLifts(NumberOfLiftsType numberOfLiftsToSet, CardDayType cardByDayOfW){
		numberOfLifts=numberOfLiftsToSet;
		cardByDayOfWeek=cardByDayOfW;
	}	

	public boolean IsPassAvailable(Date day){
		boolean answer=false;
		if ((numberOfLifts.getNumberOfLifts()>0)&&(cardByDayOfWeek.allowPass(day))){
			answer=true;
			numberOfLifts.setNumberOfLifts(numberOfLifts.getNumberOfLifts()-1);
		}
		return answer;		
	}

	
	@Override
	public String toString(){
		return "ID="+this.getID()+", "+
				typeOfCard()+": "+ numberOfLifts.toString()+" " +cardByDayOfWeek.toString();
		
	}

	@Override
	public CardTypes typeOfCard() {
		return type;
	}

}
