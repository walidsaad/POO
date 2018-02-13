package formeinterface;

public class Cercle implements Forme{
	private double  rayon ;
	private int origine_x ;
	private int origine_y ;
	final static double PI=3.14;
	public Cercle(double r) {
	this.rayon = r ;
	this.origine_x = 0 ;
	this.origine_y = 0 ;
	}
	public double getRayon() {
	return this.rayon ;
	}
	public double  surface() {
	return this.rayon*this.rayon* this.PI ;
	}
	public void deplace(int x, int y) {
		this.origine_x = this.origine_x + x ;
		this.origine_y = this.origine_y + y ;
		}
	public void affiche() {
	System.out.println("cercle " + rayon);
	}

}
