package singleton;

public class RunSingleton {

	public static void main(String[] args) {
		
		MySingleton instance1 = MySingleton.getInstance();
		
		MySingleton instance2 = MySingleton.getInstance();
		
		if (instance1.equals(instance2)) {
			System.out.println("Même objet");
		}
		else {
			System.out.println("Objets différents");
		}
	}

}
