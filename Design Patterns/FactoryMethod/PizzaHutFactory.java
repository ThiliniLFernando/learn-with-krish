public class PizzaHutFactory {
	public static Offer createOffer(OfferCode offerCode) {
		switch(offerCode) {
		case BASIC:
			return new BasicOffer();
		 case FEASTY:
			return new FeastyOffer();
		 case PATRYCOMBO:
			return new PartyComboOffer();
		 default:
			return null;
		}
	}
}
