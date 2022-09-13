package Factory;

import java.math.BigDecimal;

public class BasicOffer extends Offer {
	
	public BasicOffer() {
		super("Basic Offer");
	}
	
	@Override
	protected void createOffer() {
		price = new BigDecimal(1000);
		foodItems.add(new Pizza());
	}
}
