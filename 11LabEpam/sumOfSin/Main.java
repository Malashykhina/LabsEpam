package sumOfSin;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	ThreadsCreator t = new ThreadsCreator(5,20);
    	System.out.println(t.getSumOfSin());
    }
}

