package enums;

import java.util.Date;

public enum Season {WINTER,SPRING,SUMMER,AUTUMN;
	
	static Season getSeason(Date day){
		Season answer;
		if ((day.getMonth()==11)||(day.getMonth()==0)||(day.getMonth()==1)){
		answer=Season.WINTER;
		}else{
			if ((day.getMonth()==2)||(day.getMonth()==3)||(day.getMonth()==4)){
			answer=Season.SPRING;
			}else{
				if ((day.getMonth()==5)||(day.getMonth()==6)||(day.getMonth()==7)){
				answer=Season.SUMMER;
				}else{
				answer=Season.AUTUMN;
				}
			}
		}
	return answer;	
	}
	
	private static int seasonYear(Date day){
		//for december rerurns bigger year
		//in order to find same season and year for dates in function sameSeasonAndYear
		if (day.getMonth()==11){
			return day.getYear()+1;
		}else
			return day.getYear();
	}
	
	public static boolean sameSeasonAndYear(Date day, Date day2){
		return ((getSeason(day)==getSeason(day2))&&(seasonYear(day)==seasonYear(day2)));	
	}
}
