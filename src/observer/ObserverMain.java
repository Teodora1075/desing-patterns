package observer;

public class ObserverMain {

	public static void main(String[] args) {

		Item item = new Item();
		
		Observer obs1 = new Cart("Product1");
		Observer obs2 = new Cart("Product2");
		Observer obs3 = new Cart("Product3");

		item.addToCart(obs1);
		item.addToCart(obs2);
		item.addToCart(obs3);

		item.setName("Cart1");
		item.setName("MyCart");
		
	}

}
