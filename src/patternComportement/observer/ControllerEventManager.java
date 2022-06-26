package patternComportement.observer;

public class ControllerEventManager {
	
	private EventManager events;
	private String message;
	
	public ControllerEventManager() {
		this.events  = new EventManager();
		this.message = "";
	}
	
	public void receiveMessage(String message) {
		this.message = message;
		events.notify("message reçu : " + this.message);
	}
	
	public void sendMessage(String message) {
		this.message = message;
		events.notify("message envoyé : " + this.message);
	}

	public EventManager getEvents() {
		return events;
	}

	public void setEvents(EventManager events) {
		this.events = events;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
