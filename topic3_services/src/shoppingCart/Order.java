package shoppingCart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Order implements IOrder {
	public String uid;
	private Map<String, Product> map;
	
	public Order(){}
	public Order(String uid){
		this.uid = uid;
		map = new HashMap<String, Product>();
	}
	
	public boolean addProduct(Product p) {
		if (map.containsKey(p.getPid())){
			Product p1 = (Product) map.get(p.getPid());
			p1.setPrice(p1.getPrice()+p.getPrice());
			p1.setQuantity(p1.getQuantity()+p.getQuantity());
			return true;
		}
		map.put(p.getPid(),p);
		return false;
	}
	
	public boolean removeProduct(String pid)
	throws ProductNotFoundException {
		if(map.containsKey(pid)){
			map.remove(pid);
			return true;
		}else throw new ProductNotFoundException("Product with ID "+pid+" is not found.");
	}
	
	public Collection<Product> getCartDetails() {
		return map.values();
	}
	
	public Product getProductFromCart(String pid)
	throws ProductNotFoundException {
		if(map.containsKey(pid)){
			return (Product) map.get(pid);
		}else {
			throw new ProductNotFoundException ("Product with ID "+pid+" is not found.");
		}
	}
	
	public int productCount() {
		return map.size();
	}

	public double getCartPrice() {
		double price = 0.0d;
		Iterator<Product> iterator = getCartDetails().iterator();
		while (iterator.hasNext()) {
			price += iterator.next().getPrice();
		}
		return price;
	}
}
