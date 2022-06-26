package patternCreation.factory01;

public class ProduitFactory2 extends ProduitFactory {

	  protected ProduitA createProduitA() {
	    return new ProduitA2();
	  }
	}