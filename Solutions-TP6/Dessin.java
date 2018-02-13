import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

//Cette classe herite de canvas pour redéfinir la
//methode paint. La vue est codee dans cette classe

class Dessin extends Canvas {
String figure ;
Color couleur ;
String text ;
//le constructeur de la classe
public Dessin() {
figure = "Carre" ;
couleur = Color.blue ;
text = "Hello World" ;
this.setBackground(Color.white);
}
public void paint(Graphics g) {
//un rectangle noir encadre le composant
g.setColor(Color.black);
g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
//le texte est affiche
g.drawString(text, 10, 15);
//la couleur est choisie
g.setColor(couleur);
//la figure est affichee
if (figure.equals("Carre")) {
g.drawRect(50, 30, 100, 100);
} else if (figure.equals("Cercle")) {
g.drawOval(50, 30, 100, 100);
} else {
g.drawLine(50, 130, 100, 30);
g.drawLine(100, 30, 150, 130);
g.drawLine(50, 130, 150, 130);
}
}
//ces methodes permettent de changer le texte,
//la couleur ou la figure a afficher
public void setText(String txt) {
text = txt ;
}
public void setCouleur(String coul) {
if (coul.equals("Bleu")) {
couleur = Color.blue ;
} else if (coul.equals("Rouge")) {
couleur = Color.red ;
} else {
couleur = Color.green ;
}
}
public void setFigure(String fig) {
figure = fig ;
}
//La redéfinition de cette methode permet de specifier
//la taille preferree du composant
public Dimension getPreferredSize() {
return new Dimension(200, 200);
}
}
