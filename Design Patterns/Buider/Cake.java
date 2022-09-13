public class Cake {
	
	private final String cakeType;
	private final String icing;
	private final int layers;
	private final String sprinkles;
	private final String ganache;
	
	public Cake(Decor decor) {
		this.cakeType = decor.cakeType;
		this.icing = decor.icing;
		this.layers = decor.layers;
		this.sprinkles = decor.sprinkles;
		this.ganache = decor.ganache;
	}
	
	
	static class Decor{
		
		private String cakeType;
		private String icing;
		private int layers;
		private String sprinkles;
		private String ganache;

		public Cake make() {
			return new Cake(this);
		}
		
		public Decor(String cakeType) {
			this.cakeType = cakeType;
		}
		
		public Decor icing(String icing) {
			this.icing = icing;
			return this;
		}
		
		public Decor layers(int layers) {
			this.layers = layers;
			return this;
		}
		
		public Decor sprinkles(String sprinkles) {
			this.sprinkles = sprinkles;
			return this;
		}
		
		public Decor ganache(String ganache) {
			this.ganache = ganache;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Cake [cakeType=" + cakeType + ", icing=" + icing + ", layers=" + layers + ", sprinkles=" + sprinkles
				+ ", ganache=" + ganache + "]";
	}

}
