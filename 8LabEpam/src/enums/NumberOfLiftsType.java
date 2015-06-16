package enums;

public enum NumberOfLiftsType {TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100);
	
	protected int numberOfLifts; 
	
	NumberOfLiftsType(int val){
		numberOfLifts=val;
	}
	public int getNumberOfLifts(){
		return numberOfLifts;
	}
	public void setNumberOfLifts(int newNumber){
		numberOfLifts=newNumber;
	}
}
