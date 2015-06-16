package Runner;
import java.util.ArrayList;
import java.util.Date;

import enums.CardTypes;

import SystemAndTurnstile.CardsSystem;
import SystemAndTurnstile.Turnstile;
import TypesOfSkiPass.SkiPassParent;

public class SystemRunner {
	
	public static void main(String[] args) {
		CardsSystem cS=new CardsSystem();
		cS.createSomeCards(UserData.arr);
		//cS.addSkiPass(new Date("9/10/2015"));
		ArrayList <SkiPassParent> allSkiPass =cS.getAllSkiPass();
		for (SkiPassParent s :allSkiPass ){
			System.out.print(s);//prints information about a card
			System.out.println(";\t"+Turnstile.IsPassAvailable(new Date("10/9/2015"), s));
			//prints result for a card for special date
		}
		System.out.println("Number of successful passes: "+Turnstile.getNumberOfPass());
		System.out.println("Number of successful passes for cards by number of lifts: "
				+Turnstile.getNumberOfPass(CardTypes.BY_NUMBER_OF_LIFTS));
		System.out.println("Number of successful passes for cards by time period: "
				+Turnstile.getNumberOfPass(CardTypes.BY_TYME_PERIOD));
		System.out.println("Number of successful passes for season cards: "
				+Turnstile.getNumberOfPass(CardTypes.FOR_SEASON));
		
		System.out.println("Number of fail passes: "+Turnstile.getNumberOfRejectedPasses());
		System.out.println("Number of fail passes for cards by number of lifts: "
				+Turnstile.getNumberOfRejectedPasses(CardTypes.BY_NUMBER_OF_LIFTS));
		System.out.println("Number of fail passes for cards by time period: "
				+Turnstile.getNumberOfRejectedPasses(CardTypes.BY_TYME_PERIOD));
		System.out.println("Number of fail passes for season cards: "
				+Turnstile.getNumberOfRejectedPasses(CardTypes.FOR_SEASON));


	}

}
