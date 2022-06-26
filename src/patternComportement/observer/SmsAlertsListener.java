package patternComportement.observer;

public class SmsAlertsListener implements EventListener{
	
	private String numero;
	private String message;
	
	public SmsAlertsListener(String numero, String message) {
		//super();
		this.numero = numero;
		this.message = message;
	}

	@Override
	public void update(String message) {
		this.message = message;
		System.out.println("Envoi sms à : " + this.numero + " message : " + this.message);
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
