package Factory;

import java.math.BigDecimal;

public class FeastyOffer extends Offer {
	
	public FeastyOffer() {
		super("Feasty Offer");
	}

	@Override
	protected void createOffer() {
		price = new BigDecimal(4000);
		
		foodItems.add(new Pizza());
		foodItems.add(new Appetizer());
		foodItems.add(new Beverage());
	}
}
