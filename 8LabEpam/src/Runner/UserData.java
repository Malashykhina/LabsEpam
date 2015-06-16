package Runner;

import java.util.Date;

import TypesOfSkiPass.SkiPassByNumberOfLifts;
import TypesOfSkiPass.SkiPassByTimePeriod;
import TypesOfSkiPass.SkiPassParent;
import TypesOfSkiPass.SkiPassSeason;
import enums.CardDayType;
import enums.DurationType;
import enums.NumberOfLiftsType;

public class UserData {
	public static SkiPassParent[] arr={	
	new SkiPassByNumberOfLifts(NumberOfLiftsType.TWENTY, CardDayType.DayOff),
	new SkiPassByNumberOfLifts(NumberOfLiftsType.HUNDRED,CardDayType.WeekDay),
	new SkiPassByNumberOfLifts(NumberOfLiftsType.HUNDRED,CardDayType.DayOff),
	new SkiPassByNumberOfLifts(NumberOfLiftsType.TEN,CardDayType.DayOff),
	new SkiPassByTimePeriod(DurationType.FIRST_HALF, new Date("04/09/2015"),CardDayType.DayOff),
	new SkiPassSeason(new Date("12/25/2014"))};
	}
