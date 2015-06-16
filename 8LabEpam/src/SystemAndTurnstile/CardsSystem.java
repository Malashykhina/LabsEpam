package SystemAndTurnstile;

import java.util.ArrayList;
import java.util.Date;

import Runner.UserData;
import TypesOfSkiPass.SkiPassByNumberOfLifts;
import TypesOfSkiPass.SkiPassByTimePeriod;
import TypesOfSkiPass.SkiPassParent;
import TypesOfSkiPass.SkiPassSeason;

import enums.CardDayType;
import enums.DurationType;
import enums.NumberOfLiftsType;

public class CardsSystem {//это фабрика-методы, реестр- это масив, к которому все обращаются, даже если фабрик много,
	
	ArrayList<SkiPassParent> arr=new ArrayList<SkiPassParent>();

	public void addSkiPass(NumberOfLiftsType num, CardDayType day){
		arr.add(new SkiPassByNumberOfLifts(num, day));
	}
	public void addSkiPass(DurationType duration, Date startDate, CardDayType day){
		arr.add(new SkiPassByTimePeriod(duration, startDate,day));
	}
	public void addSkiPass(Date startDate){
		arr.add(new SkiPassSeason(startDate));
	}
	
	public void createSomeCards(SkiPassParent[] array){
		for(int i=0;i<array.length;i++){
			arr.add(array[i]);
		}
		}
	
	public ArrayList<SkiPassParent> getAllSkiPass(){
		return arr;
	}

}
