package formeinterface;

public class TestMain {
	 static public void main(String[] sArgs){
		 Forme[] tableau = new Forme[4];
		 tableau[0] = new Rectangle(10,20);
		 tableau[1] = new Cercle(15);
		 tableau[2] = new Rectangle(5,30);
		 tableau[3] = new Carre(10);
	 /*
	  Le polymorphisme est la faculté attribuée à un objet d’être une instance de plusieurs classes.
Il a une seule classe “réelle” qui est celle dont le constructeur a été appelé en premier 
(c’est-à-direla classe figurant après le new) mais il peut aussi être déclaré avec une classe supérieure à sa classe
réelle. Cette propriété est très utile pour la création d’ensembles regroupant des objets de classes
différentes comme dans l’exemple suivant. L’opérateur instanceof peut être utilisé pour tester 
l’appartenance à une classe
	 */
	 for (int i = 0 ; i < tableau.length ; i++) {
		 if (tableau[i] instanceof Forme)
		 System.out.println("element " + i + " est une forme");
		 if (tableau[i] instanceof Cercle)
		 System.out.println("element " + i + " est un cercle");
		 if (tableau[i] instanceof Rectangle)
		 System.out.println("element " + i + " est un rectangle");
		 if (tableau[i] instanceof Carre)
		 System.out.println("element " + i + " est un carré");
		 }
	/*
	 Une des propriétés induites par le polymorphisme est que l’interpréteur Java est capable de
trouver le traitement à effectuer lors de l’appel d’une méthode sur un objet.
Dans notre exemple, la méthode affiche() est redéfinie dans toutes les sous-classes de Forme
et les traitements effectués sont : (meme chose pour les autres méthodes)
	 */
	 for (int i = 0 ; i < tableau.length ; i++) {
		 tableau[i].affiche();
		 }
}
}
