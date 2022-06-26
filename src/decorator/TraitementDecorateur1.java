package decorator;

public class TraitementDecorateur1 extends TraitementDecorateur {

	public TraitementDecorateur1() {
		super();
	}

	public TraitementDecorateur1(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void Operation() {
		if (traitement != null) {
			traitement.Operation();
		}
		System.out.println("TraitementDecorateur1.Operation()");
	}
}