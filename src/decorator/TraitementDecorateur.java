package decorator;

public abstract class TraitementDecorateur implements Traitement{
	
	protected Traitement traitement;

	public TraitementDecorateur() {
	}

	public TraitementDecorateur(Traitement traitement) {
		this.traitement = traitement;
	}

	public void Operation() {
		if (traitement != null) {
			traitement.Operation();
		}
	}
}
