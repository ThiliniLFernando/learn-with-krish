package Factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Offer {
	protected List<FoodItem> foodItems = new ArrayList<FoodItem>();
	protected BigDecimal price;
	private String offerName;
	
	public Offer(String offerName) {
		this.offerName = offerName;
		createOffer();
	}
	
	protected abstract void createOffer();
	
	public String getOfferName() {
		return offerName;
	}
	
	@Override
	public String toString() {
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		for(FoodItem unique : foodItems) {
			if(result.containsKey(unique.toString())) {
				int i = result.get(unique.toString()) + 1;
				result.put(unique.toString(), i);
			}else {
				result.put(unique.toString(), 1);
			}
		}
		return offerName+" ["+
				"Includes "+result+
				" Price : Rs."+price+" ]";
	}
	
}
