package Factory;

import java.math.BigDecimal;

public class PartyComboOffer extends Offer {
	
	public PartyComboOffer() {
		super("Party Combo Offer");
	}
	
	@Override
	protected void createOffer() {
		price = new BigDecimal(9000);
		
		foodItems.add(new Pizza());
		foodItems.add(new Pizza());
		foodItems.add(new Appetizer());
		foodItems.add(new Appetizer());
		foodItems.add(new Appetizer());
		foodItems.add(new Appetizer());
		foodItems.add(new Cake());
		foodItems.add(new Beverage());
	}
}
