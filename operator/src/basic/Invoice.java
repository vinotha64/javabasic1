package basic;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		if(quantity<0)
			System.out.println(0);
		else
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0) 
			System.out.println(0);
		else
		this.price = price;
	}
	
	public void getInvoiceAmount() {
		price=price*quantity;
		 System.out.println(price);
	}
 public static void main(String[] args) {
	 Invoice i1=new Invoice();
	 i1.setPrice(100);
	 i1.setQuantity(5);
	 i1.getInvoiceAmount();
	
 }
}

