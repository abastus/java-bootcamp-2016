package shoppingCart;

import java.util.Iterator;

public class OrderTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Order o = new Order("Agustín Bastús");
		o.addProduct(new Product("p100","Tea",11,20));
		o.addProduct(new Product("p101","Coffee",9,25));
		o.addProduct(new Product("p101","Coffee",3,10));
		
		System.out.println("\nNo. of Products: "+o.productCount());
		System.out.println("Ordered by: "+o.uid);
		
		// method remove --> o.removeProduct("p101");
		// method search for product by ID --> o.getProductFromCart("p101");
		
		System.out.println(o.getCartPrice());
		
		final Iterator<Product> it = o.getCartDetails().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
