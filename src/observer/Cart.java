package observer;



public class Cart implements Observer {
	
	private String name;
	private Observable subscribedTo;

	public Cart(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.subscribedTo == null) { 
			System.out.println(this.getName() + " The item has no in your cart ");
			return;
			
		}
		
		
		String newName = this.subscribedTo.getUpdate();
		System.out.println(this.getName() + " The item now is in cart with a new name " + newName);
		
	}

	@Override
	public void setName(Observable name) {
		this.subscribedTo = name; 
		
	}

	public String getName() {
		return name;
	}

}
