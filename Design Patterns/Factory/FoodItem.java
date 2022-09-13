package Factory;

public abstract class FoodItem {
	private String foodName ;
	
	public FoodItem(String foodName){
		this.foodName = foodName ;
	}
	
	@Override
	public String toString() {
		return foodName;
	}
}
