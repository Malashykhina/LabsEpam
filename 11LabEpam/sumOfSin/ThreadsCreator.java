package sumOfSin;

import java.util.ArrayList;

public class ThreadsCreator {
	public ThreadsCreator(int numberOfThreads, int maxValue){
		if (numberOfThreads<=1){
			Thread t=new Thread(new SumOfSin(0,-maxValue,maxValue));
			t.start();
		}else{
			ArrayList<Thread> threads=new ArrayList<Thread>();
			int interval=2*maxValue/numberOfThreads;
			for(int i=0;i<numberOfThreads-1;i++){
				threads.add(new Thread(new SumOfSin(i,i*interval-maxValue, (i+1)*interval-maxValue-1)));
			}
			threads.add(new Thread(new SumOfSin(numberOfThreads-1,(numberOfThreads-1)*interval-maxValue, maxValue)));
			
			for(Thread th:threads){
				th.start();
				try {
					th.join();
					}
				catch (InterruptedException e) {
				}
			}
		}
	}
    public double getSumOfSin(){
    	return SumOfSin.sum;
    }
}