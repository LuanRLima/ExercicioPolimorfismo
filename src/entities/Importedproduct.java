package entities;

public class Importedproduct extends Product {
	
	private Double customsFee;
	
	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return super.priceTag() + " (Customs fee: $ " + this.customsFee + ")";
	}
	
	public Double totalPrice () {
		return this.getPrice() + this.customsFee;
	}

	public Importedproduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	

}
