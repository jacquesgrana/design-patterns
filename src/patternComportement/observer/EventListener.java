package patternComportement.observer;

//Voici l’interface des souscripteurs. Si votre langage de
//programmation prend en charge les types fonctionnels, vous
//pouvez remplacer toute la hiérarchie des souscripteurs par un
//ensemble de fonctions.
public interface EventListener {

	public void update(String event);
}
