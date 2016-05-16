package shoppingCart;

@SuppressWarnings("serial")
public class Product implements java.io.Serializable {
	public String pid;
	public String pname;
	public int quantity;
	public double price;
	
	public Product() {
		
	}
	
	public Product(String pid, String pname, int quantity, double price) {
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
