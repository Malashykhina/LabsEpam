package TypesOfSkiPass;
import java.util.Date;

import enums.CardDayType;
import enums.CardTypes;
import enums.DurationType;

public class SkiPassByTimePeriod extends SkiPassParent{

	protected static final int START_OF_DAY=9;
	protected static final int MID_OF_DAY=13;
	protected static final int END_OF_DAY=17;//enum to do
	
	private DurationType numberOfDays;//0.5, 1, 2...
	private CardDayType cardByDayOfWeek;
	private Date startDate;
	private Date finishDate;


	private CardTypes type = CardTypes.BY_TYME_PERIOD;
	
	public SkiPassByTimePeriod(DurationType newNumberOfDays, Date newStartDate,CardDayType cardByDayOfW){
		numberOfDays=newNumberOfDays;	
		startDate=newStartDate;
		cardByDayOfWeek=cardByDayOfW;
		//finishDate=startDate+getDurationInDays(); //to do 
	}
	public boolean IsPassAvailable(Date date1){
		boolean answer=false;
		if ((IsAvailableByTime(date1))&&(cardByDayOfWeek.allowPass(date1))){
			answer=true;
		}
		return answer;	
	}
	private boolean IsAvailableByTime(Date date){
		boolean answer=false;
		long startDayMs=startDate.getTime();
		long curentDayMs=date.getTime();
		long delta=curentDayMs-startDayMs;
		long deltaD=delta/1000/3600/24;
		if (deltaD<=numberOfDays.getDurationInDays()){
			answer=true;
		}
		return answer;		
	}

	
	@Override
	public String toString(){
		return "ID="+this.getID()+", "+
	typeOfCard()+": "+ numberOfDays.toString()+" " +cardByDayOfWeek.toString()+ " "+startDate.toString();
		
	}
	@Override
	public CardTypes typeOfCard() {
		return type;
	}

}
