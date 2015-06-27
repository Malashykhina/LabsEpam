package simpleNumber;

class SimpleNumsers implements Runnable {
	 public int fromValue;
	 public int toValue;
	 public int name;
     public SimpleNumsers(int name, int fromValue, int toValue) {
    	 this.fromValue=fromValue; 
    	 this.toValue=toValue;
    	 this.name=name;
     }

      public void run() { 
    	  printSimpleValues(this.fromValue, this.toValue);
      }
      private void printSimpleValues(int from, int toV){
    	  boolean numberIsSimple;
    	  for(int i=from; i<=toValue;i++){
    		  numberIsSimple=true;
    		  for(int j=2; j<=Math.sqrt(i);j++){
    		 if(((double)i)%j==0){
    			 //number is not simple if there is number(not this and not 1), that gives you 0 after division on it
    			 numberIsSimple=false;
    			 break;
    		 }}
    		  if(numberIsSimple){
    			  System.out.println("Thread "+this.name +" : "+i);
    		  }
    	  }
      }
}
