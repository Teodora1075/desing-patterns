package observer;

public interface Observable {

	void addToCart(Observer observer); // механизъм за добавяне
	void removeFromCart(Observer observer); // механизъм за махане
	
	void notifyObservers(); // можем да уведомим всички
	
	String getUpdate(); // можем да вземем последния ъпдейт
	
}
