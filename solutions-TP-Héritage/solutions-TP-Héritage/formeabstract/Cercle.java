package formeabstract;

public class Cercle extends Forme{
	private double  rayon ;
	final static double PI=3.14;
	public Cercle(double r) {
	this.rayon = r ;
	}
	public double getRayon() {
	return this.rayon ;
	}
	public double  surface() {
	return this.rayon*this.rayon* this.PI ;
	}
	public void deplace(int x, int y) {
		super.setOrigineX(super.getOrigineX()+x);
		super.setOrigineY(super.getOrigineY()+y);
		}
	public void affiche() {
	System.out.println("cercle " + rayon);
	}

}
