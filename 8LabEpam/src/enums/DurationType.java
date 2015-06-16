package enums;

import java.util.Date;

public enum DurationType {FIRST_HALF(0.5,9,13),
	SECOND_HALF(0.5,13,17), ONE(1), TWO(2), FIVE(5);
	protected static final int START_OF_DAY=9;
	protected static final int MID_OF_DAY=13;
	protected static final int END_OF_DAY=17;
	protected double duration; 
	protected int start; 
	protected int finish; 
	
	DurationType(double val){
		duration=val;
		start=START_OF_DAY;
		finish=END_OF_DAY;
	}
	DurationType(double val,int startVal,int finishVal){
		duration=val;
		start=startVal;
		finish=finishVal;
	}
	public double getDurationInDays(){
		return duration;
	}	
	public int getStart() {
		return start;
	}
	public int getFinish() {
		return finish;
	}
	
}
