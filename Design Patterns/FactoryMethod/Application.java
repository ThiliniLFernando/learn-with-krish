public class Application {
	public static void main(String []args) {
		Offer offer1 = PizzaHutFactory.createOffer(OfferCode.FEASTY);
		System.out.println(offer1);
		
		Offer offer2 = PizzaHutFactory.createOffer(OfferCode.PATRYCOMBO);
		System.out.println(offer2);
		
		Offer offer3 = PizzaHutFactory.createOffer(OfferCode.BASIC);
		System.out.println(offer3);
	}
}
