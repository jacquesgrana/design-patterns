package patternStructuration.decorator;

public class TraitementDecorateur2 extends TraitementDecorateur {

	public TraitementDecorateur2() {
		super();
	}

	public TraitementDecorateur2(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void Operation() {
		if (traitement != null) {
			traitement.Operation();
		}

		System.out.println("TraitementDecorateur2.Operation()");
	}
}
