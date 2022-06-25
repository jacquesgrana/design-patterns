package singleton;

public final class MySingleton {

	  private static MySingleton instance;

	  private MySingleton() {
	    // traitement du constructeur
	  }

	  public static MySingleton getInstance() {
	    if (instance == null) {
	      instance = new MySingleton();
	    }
	    return instance;
	  }

	  @Override
	  public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException();
	  }
	}