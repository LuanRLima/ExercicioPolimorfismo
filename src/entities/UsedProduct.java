package entities;



public class UsedProduct extends Product {

		private String manufactureDate ;
		
		@Override
		public String priceTag() {
		// TODO Auto-generated method stub
		return super.priceTag() + " (Manufacture date: " + this.manufactureDate + ")";
		}

		public String getManufactureDate() {
			return manufactureDate;
		}

		public UsedProduct(String name, Double price, String manufactureDate) {
			super(name, price);
			this.manufactureDate = manufactureDate;
		}

		public void setManufactureDate(String manufactureDate) {
			this.manufactureDate = manufactureDate;
		}
		

}
