package patternCreation.factory01;

public class ProduitFactory1 extends ProduitFactory {

	  protected ProduitA createProduitA() {
	    return new ProduitA1();
	  }
	}
