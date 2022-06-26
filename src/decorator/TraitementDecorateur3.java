package decorator;

public class TraitementDecorateur3 extends TraitementDecorateur {

	public TraitementDecorateur3() {
		super();
	}

	public TraitementDecorateur3(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void Operation() {
		if (traitement != null) {
			traitement.Operation();
		}
		System.out.println("TraitementDecorateur3.Operation()");
	}
}