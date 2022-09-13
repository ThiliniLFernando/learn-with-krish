package Factory;

import java.util.Calendar;

public class Application {
	public static void main(String []args) {
		Offer offer1 = PizzaHutFactory.getOffer(OfferCode.FEASTY);
		System.out.println(offer1);
		
		Offer offer2 = PizzaHutFactory.getOffer(OfferCode.PATRYCOMBO);
		System.out.println(offer2);
		
		Offer offer3 = PizzaHutFactory.getOffer(OfferCode.BASIC);
		System.out.println(offer3);
		
		Calendar calendar = Calendar.getInstance();
		
	}
}
