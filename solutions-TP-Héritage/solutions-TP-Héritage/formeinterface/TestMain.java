package formeinterface;

public class TestMain {
	 static public void main(String[] sArgs){
		 Forme[] tableau = new Forme[4];
		 tableau[0] = new Rectangle(10,20);
		 tableau[1] = new Cercle(15);
		 tableau[2] = new Rectangle(5,30);
		 tableau[3] = new Carre(10);
	 /*
	  Le polymorphisme est la facult� attribu�e � un objet d��tre une instance de plusieurs classes.
Il a une seule classe �r�elle� qui est celle dont le constructeur a �t� appel� en premier 
(c�est-�-direla classe figurant apr�s le new) mais il peut aussi �tre d�clar� avec une classe sup�rieure � sa classe
r�elle. Cette propri�t� est tr�s utile pour la cr�ation d�ensembles regroupant des objets de classes
diff�rentes comme dans l�exemple suivant. L�op�rateur instanceof peut �tre utilis� pour tester 
l�appartenance � une classe
	 */
	 for (int i = 0 ; i < tableau.length ; i++) {
		 if (tableau[i] instanceof Forme)
		 System.out.println("element " + i + " est une forme");
		 if (tableau[i] instanceof Cercle)
		 System.out.println("element " + i + " est un cercle");
		 if (tableau[i] instanceof Rectangle)
		 System.out.println("element " + i + " est un rectangle");
		 if (tableau[i] instanceof Carre)
		 System.out.println("element " + i + " est un carr�");
		 }
	/*
	 Une des propri�t�s induites par le polymorphisme est que l�interpr�teur Java est capable de
trouver le traitement � effectuer lors de l�appel d�une m�thode sur un objet.
Dans notre exemple, la m�thode affiche() est red�finie dans toutes les sous-classes de Forme
et les traitements effectu�s sont : (meme chose pour les autres m�thodes)
	 */
	 for (int i = 0 ; i < tableau.length ; i++) {
		 tableau[i].affiche();
		 }
}
}
