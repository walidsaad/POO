package formeabstract;

public class Rectangle extends Forme {
private int largeur ;
private int longueur ;
public Rectangle(int x, int y) {
this.largeur = x ;
this.longueur = y ;

}
public int getLargeur() {
return this.largeur ;
}
public int getLongueur() {
return this.longueur ;
}
public double surface() {
return this.longueur * this.largeur ;
}
public void deplace(int x, int y) {
	super.setOrigineX(super.getOrigineX()+x);
	super.setOrigineY(super.getOrigineY()+y);
	}
public void affiche() {
System.out.println("rectangle " + longueur + "x" + largeur);
}
}
