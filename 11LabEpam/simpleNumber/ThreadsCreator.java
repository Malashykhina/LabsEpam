package simpleNumber;

import java.util.ArrayList;

public class ThreadsCreator {
	public ThreadsCreator(int numberOfThreads, int maxValue){
		if (numberOfThreads<=1){
			Thread t=new Thread(new SimpleNumsers(0,0,maxValue));
			t.start();
		}else{
			ArrayList<Thread> threads=new ArrayList<Thread>();
			int interval=maxValue/numberOfThreads;
			for(int i=0;i<numberOfThreads-1;i++){
				threads.add(new Thread(new SimpleNumsers(i,i*interval, (i+1)*interval)));
			}
			threads.add(new Thread(new SimpleNumsers(numberOfThreads-1,(numberOfThreads-1)*interval, maxValue)));
			
			for(Thread th:threads){
				th.start();
			}
		}
	}

}
