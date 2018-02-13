import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector ;
import javax.swing.* ;
import javax.swing.border.EmptyBorder ;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class TP2 extends JFrame implements ListSelectionListener, ActionListener, ItemListener{
/**
* Les variables pointant chaque composant sont declarees
* en variables d’instance et en type protected. Elles
* auraient tres bien pu etre des variables locales au
* constructeur mais, pour des raisons pedagogiques,
* la gestion des evenements n’est presentee que plus
* tard (section events) dans une classe heritant
* de ExInterface. Les variables sont de type protected
* afin de pouvoir y accéder dans cette sous-classe.
*/
protected JRadioButton button1, button2, button3 ;
protected JComboBox couleur ;
protected JTextField text ;
protected JButton ajout ;
protected JList textList ;
protected Vector<String> listData ;
protected Dessin dessin ;

public TP2() {
super("Un exemple de fenetre");
//le programme doit se terminer quand la fenetre est fermee
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// creation du panel gauche
JPanel gauche = new JPanel(new GridLayout(6, 1, 0, 5));
// creation des cases a cocher
JLabel label = new JLabel("Forme:");
button1 = new JRadioButton("Carre", true);
button2 = new JRadioButton("Cercle", false);
button3 = new JRadioButton("Triangle", false);
JLabel label2 = new JLabel("Couleur:");
couleur = new JComboBox();
couleur.addItem("Bleu");
couleur.addItem("Rouge");
couleur.addItem("Vert");
// le groupe de bouton permet d’interdire la selection
// de plusieurs cases en meme temps
ButtonGroup group = new ButtonGroup();
group.add(button1);
group.add(button2);
group.add(button3);
// remplissage du panel gauche
gauche.add(label);
gauche.add(button1);
gauche.add(button2);
gauche.add(button3);
gauche.add(label2);
gauche.add(couleur);
// creation du panel bas
JPanel bas = new JPanel(new BorderLayout(0, 10));
// creation et remplissage du panel d’ajout de texte
JPanel textPanel = new JPanel(new GridLayout(3, 1, 0, 5));
label = new JLabel("Ajouter un texte possible:");
textPanel.add(label);
text = new JTextField(16);
textPanel.add(text);
ajout = new JButton("Ajouter");
textPanel.add(ajout);

//creation du modele de la liste
listData = new Vector<String>();
listData.addElement("Hello World");
listData.addElement("Une belle figure");
listData.addElement("Champions du monde !");
listData.addElement("A ciao, bonsoir...");
listData.addElement("Changez la couleur");
listData.addElement("J’adore Java");
listData.addElement("Allez les verts !");
listData.addElement("Ca marche");
listData.addElement("blablabla");
//creation de la liste
textList = new JList(listData);
textList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//l’inclusion de la liste dans un JScrollPane permet
//de la faire defiler par des ascenceurs
JScrollPane scrollPane = new JScrollPane(textList);
scrollPane.setPreferredSize(new Dimension(200, 100));
//remplissage du panel bas
bas.add(scrollPane, BorderLayout.NORTH);
bas.add(textPanel, BorderLayout.SOUTH);
// remplissage du panel principal
JPanel mainPanel = (JPanel) this.getContentPane();
mainPanel.setLayout(new BorderLayout(10, 10));
mainPanel.add(gauche, BorderLayout.WEST);
dessin = new Dessin();
mainPanel.add(dessin, BorderLayout.CENTER);
mainPanel.add(bas, BorderLayout.SOUTH);
// une bordure permet d’aerer l’affichage
mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
// calcul de la dimension de la fenetre
this.pack();
//Partie Evenements

button1.addItemListener(this);
button2.addItemListener(this);
button3.addItemListener(this);
couleur.addItemListener(this);
// le role de contrôleur pour la liste et le champ de
// texte est assure par ListSelectionListener
textList.addListSelectionListener(this);
text.addActionListener(this);
// Le controleur du bouton est ecrit directement dans
// la classe
ajout.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String str = text.getText();
if (str.length() > 0) {
listData.addElement(text.getText());
text.setText("");
textList.setListData(listData);
}
}
});
}

//Cette methode est appelee si la touche entree est
//pressee dans le champ de texte
public void actionPerformed(ActionEvent e) {
String str = text.getText();
//Le texte du champ est ajoute à la liste des textes
if (str.length() > 0) {
listData.addElement(text.getText());
text.setText("");
textList.setListData(listData);
}
}
//Cette methode est appelee si la selection de la liste
//change
public void valueChanged(ListSelectionEvent e) {
	String selected = (String) textList.getSelectedValue();
	// Le texte affiche est mis a jour en fonction de la
	// nouvelle selection
	if (selected != null) {
	dessin.setText(selected);
	} else {
	dessin.setText("");
	}
	dessin.repaint();
}

//Cette méthode est appelee si la selection d’un bouton
//change
public void itemStateChanged(ItemEvent e) {
//On teste que l’evenement est bien une selection
if (e.getStateChange() == ItemEvent.SELECTED) {
//traitement à effectuer si l’evenement s’est
//produit sur un JRadioButton
if (e.getSource() instanceof JRadioButton) {
dessin.setFigure(((JRadioButton) e.getItem()).getText());
} // traitement a effectuer si l’evenement s’est
//produit sur un JComboBox
else if (e.getSource() instanceof JComboBox) {
dessin.setCouleur((String) e.getItem());
} else {
System.err.println("Erreur - composant non valide");
}
dessin.repaint();
}
}

//Fonction Main
public static void main(String[] args) {
TP2 myInterface = new TP2();
myInterface.setVisible(true);
}


}
