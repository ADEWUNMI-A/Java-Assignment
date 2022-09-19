public class PetrolPurchase {
	private String location;
	private String petrolType;
	private int quantityOfPurchase;
	private double pricePerLiter;
	private double percentageDiscount;


	public PetrolPurchase(String location, String petrolType, int quantityOfPurchase, double pricePerLiter, double percentageDiscount) {
		this.location = location;

		this.petrolType = petrolType;

		if (quantityOfPurchase > 0) {
		this.quantityOfPurchase = quantityOfPurchase;}

		if (pricePerLiter > 0) {
		this.pricePerLiter = pricePerLiter;}

		this.percentageDiscount = percentageDiscount;
}

		public void setLocation(String location) {
			this.location = location;	}

		public void setPetrolType(String petrolType) {
			this.petrolType = petrolType;	}

		public void setQuantity(int quantityOfPurchase) {
			if (quantityOfPurchase > 0) {
		this.quantityOfPurchase = quantityOfPurchase;}
				}

		public void setPrice(double pricePerLiter) {
			if (pricePerLiter > 0) {
		this.pricePerLiter = pricePerLiter;}
				}

		public void setDiscount(double percentageDiscount) {
				this.percentageDiscount = percentageDiscount;	}

		public String getLocation() {
			return location;	}

		public String getPetrolType() {
			return petrolType;	}

		public int getQuantity() {
			return quantityOfPurchase;}

		public double getPrice() {
			return pricePerLiter;}

		public double getDiscount() {
			return percentageDiscount;	}

		public double getPurchaseAmount() {
			 double discount = (percentageDiscount / 100) * (quantityOfPurchase * pricePerLiter);
			double purchaseAmount = (quantityOfPurchase * pricePerLiter) - discount;
			return purchaseAmount; 	}




		


}