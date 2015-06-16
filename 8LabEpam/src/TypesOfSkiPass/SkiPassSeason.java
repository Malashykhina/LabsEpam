package TypesOfSkiPass;
import java.util.Date;
import enums.CardTypes;
import enums.Season;

public class SkiPassSeason extends SkiPassParent{
	private Date startDate;
	private CardTypes type = CardTypes.FOR_SEASON;
	public SkiPassSeason(Date date){
		startDate=date;
	}
	
	public boolean IsPassAvailable(Date date){
		return Season.sameSeasonAndYear(date,startDate);	
	}

	
	@Override
	public String toString(){
		return  "ID="+this.getID()+", "+
	typeOfCard()+": "+ startDate.toString();
		
	}

	@Override
	public CardTypes typeOfCard() {
		// TODO Auto-generated method stub
		return type;
	}

}
