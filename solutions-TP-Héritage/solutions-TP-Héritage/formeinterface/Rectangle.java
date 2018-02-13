package formeinterface;

public class Rectangle implements Forme {
private int largeur ;
private int longueur ;
private int origine_x ;
private int origine_y ;
public Rectangle(int x, int y) {
this.largeur = x ;
this.longueur = y ;
this.origine_x = 0 ;
this.origine_y = 0 ;
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
	this.origine_x = this.origine_x + x ;
	this.origine_y = this.origine_y + y ;
	}
public void affiche() {
System.out.println("rectangle " + longueur + "x" + largeur);
}
}
