public class Application {
	public static void main(String []args) {
		Cake.Decor decor = new Cake.Decor("Vanila Cake");
		Cake cake = decor
				.icing("Vanila butter cream")
				.layers(1).sprinkles("suger pearls")
				.make();
		System.out.println(cake);
		
	}
}
