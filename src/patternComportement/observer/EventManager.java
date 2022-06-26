package patternComportement.observer;

import java.util.ArrayList;
import java.util.List;

//La classe de base diffuseur contient le code pour
//l’inscription et les méthodes de notification.
public class EventManager {
	private List<EventListener> listeners;
	
	public EventManager() {
		this.listeners = new ArrayList<>();
	}
	
	public void suscribe(EventListener listener) {
		this.listeners.add(listener);
	}
	
	public void unsuscribe(EventListener listener) {
		this.listeners.remove(listener);
	}
	
	public void notify(String event) {
		for(EventListener listener : this.listeners) {
			listener.update(event);
		}
	}
}
