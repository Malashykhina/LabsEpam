package SystemAndTurnstile;

import java.util.ArrayList;
import java.util.Date;

import enums.CardTypes;

import TypesOfSkiPass.SkiPassParent;


public class Turnstile {
	static ArrayList<StatisticsType> statistics=new ArrayList<StatisticsType>();
	
	public static boolean IsPassAvailable(Date day, SkiPassParent skiPassObj ){
		boolean result= skiPassObj.IsPassAvailable(day);
		statistics.add(new StatisticsType(skiPassObj, day,result));
		return result;		
	}
	
	public static int getNumberOfPass(){
		int result=0;
		for( int i=0; i<statistics.size();i++){
			if (statistics.get(i).getPassAvailable()){
				result++;
			}
		}
		return result;
	}
	public static int getNumberOfPass(CardTypes cT){
		int result=0;
		for( int i=0; i<statistics.size();i++){
			if ((statistics.get(i).getType()==cT)&&(statistics.get(i).getPassAvailable())){
				result++;
			}
		}
		return result;
	}
	public static int getNumberOfRejectedPasses(){
		return statistics.size()-getNumberOfPass();
	}
	public static int getNumberOfRejectedPasses(CardTypes cT){
		int result=0;
		for( int i=0; i<statistics.size();i++){
			if ((statistics.get(i).getType()==cT)&&(!statistics.get(i).getPassAvailable())){
				result++;
			}
		}
		return result;
	}
	//турникет -это система, которая принимает и говорит -пропустить карту или нет
	
	//IsPassAvailable(Date day);
}
