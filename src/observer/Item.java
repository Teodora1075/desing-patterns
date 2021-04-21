package observer;

import java.util.ArrayList;
import java.util.List;

public class Item implements Observable {
	
	private List<Observer> toCart;
	private String name;

	public Item() {
		this.toCart = new ArrayList<>();
	}

	@Override
	public void addToCart(Observer observer) { // добавяме в списъка
		this.toCart.add(observer);
		observer.setName(this);

	}

	@Override
	public void removeFromCart(Observer observer) { // махаме от списъка
		this.toCart.remove(observer);
	}

	@Override
	public void notifyObservers() { // уведомяваме всеки един
		for(Observer observer: this.toCart) {
			observer.update(); // ъпдейтваме всеки един 
		}

	}

	@Override
	public String getUpdate() { // просто връща name
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
		this.notifyObservers();
	}

}
