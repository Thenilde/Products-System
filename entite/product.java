package entite;

public class product {
	
	public String name;
	public double price;
	public int quantity;
	
    
	public double TotalValueOfStock() {
		return price * quantity;
	
	}
	public void AddProducts(int quantity) {
		this.quantity+=quantity;
	}
	public void RemoveProduct(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return name +", $" + String.format("%.2f", price)+ "," + quantity +
				"units, Total: $" + String.format("%.2f", TotalValueOfStock());
	}
		
	}
		
	

