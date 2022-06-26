package patternComportement.observer;

public class RunObserve {

	public static void main(String[] args) {
		ControllerEventManager controller = new ControllerEventManager();
		
		EmailAlertsListener emailListener1 = new EmailAlertsListener("test@toto.com", "");
		EmailAlertsListener emailListener2 = new EmailAlertsListener("toto@coincoin.com", "");
		SmsAlertsListener smsListener1 = new SmsAlertsListener("0606060606", "");
		SmsAlertsListener smsListener2 = new SmsAlertsListener("0707070707", "");
		SmsAlertsListener smsListener3 = new SmsAlertsListener("0899111111", "");
		
		controller.getEvents().suscribe(emailListener1);
		controller.getEvents().suscribe(emailListener2);
		controller.getEvents().suscribe(smsListener1);
		controller.getEvents().suscribe(smsListener2);
		controller.getEvents().suscribe(smsListener3);
		
		controller.receiveMessage("Salut les amis");
		
		System.out.println();
		
		controller.sendMessage("Salut, comment ça va ?");

	}

}
