package sumOfSin;

class SumOfSin implements Runnable {
	 public int fromValue;
	 public int toValue;
	 public int name;
	 public static volatile double sum;
     public SumOfSin(int name, int fromValue, int toValue) {
    	 this.fromValue=fromValue; 
    	 this.toValue=toValue;
    	 this.name=name;
     }

      public void run() { 
    	  printSimpleValues(this.fromValue, this.toValue);
      }
      private void printSimpleValues(int from, int toV){
    	  for(int i=from; i<=toValue;i++){
    		  sum+=Math.sin(i);
    		 // System.out.println("Thread "+this.name +" i="+i+";Math.sin(i)="+Math.sin(i)+" : "+sum);
    	  }
      }
}
