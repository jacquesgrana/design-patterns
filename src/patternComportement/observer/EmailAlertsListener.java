package patternComportement.observer;

public class EmailAlertsListener implements EventListener{
	
	private String email;
	private String message;
	
	public EmailAlertsListener(String email, String message) {
		//super();
		this.email = email;
		this.message = message;
	}

	@Override
	public void update(String message) {
		this.message = message;
		System.out.println("Envoi email à : " + this.email + " message : " + this.message);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
