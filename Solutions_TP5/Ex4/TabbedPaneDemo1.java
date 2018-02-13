
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.border.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;


import java.awt.*;

public class TabbedPaneDemo1 extends JPanel implements ActionListener{
	JTextField saisieAuteur=new JTextField(20);
  	 JTextField saisieTitre=new JTextField(20);
  	 JTextField saisieISBN=new JTextField(20);
  	 JPanel ajoutlivre= new JPanel();
  	 JPanel listlivre=new JPanel();
  	 JLabel auteur=new JLabel("Auteur");
  	 JLabel titre=new JLabel("Titre");
  	 JLabel isbn=new JLabel("ISBN");
  	 JButton ajouter=new JButton("Ajouter");
  	 JButton quitter=new JButton("Quitter");
  	 JButton afficher=new JButton("Afficher");
  	 JTextArea livres =new JTextArea();
     public TabbedPaneDemo1() {
     
		ImageIcon icon = new ImageIcon("");
        JTabbedPane tabbedPane = new JTabbedPane();
        Component panel1 = contenuPremierOnglet();		
        tabbedPane.addTab("Ajouter Livres",icon,panel1, "Ajouter Livres");
        tabbedPane.setSelectedIndex(0);
        Component panel2 = contenuDeuxiemeOnglet();
        tabbedPane.addTab("Rechercher Livres", icon, panel2, "Rechercher Livres");
        Component panel3 = contenuTroisiemeOnglet();
        tabbedPane.addTab("Emprunter Livres", icon, panel3, "Emprunter Livres");
        setLayout(new GridLayout(1, 1)); 
        add(tabbedPane);
    }

 public Component contenuPremierOnglet() {
	 
	 JPanel panel= new JPanel();
	 panel.setLayout(new  BorderLayout());
	 ajoutlivre.setLayout(new  GridLayout(4, 1, 0, 5));
	 ajoutlivre.add(titre);ajoutlivre.add(saisieTitre);
	 ajoutlivre.add(auteur); ajoutlivre.add(saisieAuteur);
	 ajoutlivre.add(isbn); ajoutlivre.add(saisieISBN);
	//on utilise le composant Box pour ajuster l'affichage
	 Box ajouterBox=Box.createVerticalBox();
	 ajouterBox.add(ajouter);
	 ajoutlivre.add(ajouterBox);
	 ajoutlivre.setBorder(BorderFactory.createTitledBorder("Ajout d'un livre"));
     panel.add( ajoutlivre,BorderLayout.NORTH);
     //on utilise le composant Box pour ajuster l'affichage
	 listlivre.setLayout(new GridLayout(2, 1, 0, 3));
	 Box livreBox=Box.createVerticalBox();
	// livreBox.add(livres);
	 JScrollPane scrollPane = new JScrollPane(livres);
	 listlivre.add(scrollPane);
	 livreBox.add(quitter);
	 listlivre.add(livreBox);
	 listlivre.setBorder(BorderFactory.createTitledBorder("Liste des livres"));
	 panel.add( listlivre,BorderLayout.CENTER);
	 ajouter.addActionListener(this);
	 quitter.addActionListener(this);
	return panel;		
    }
public Component contenuDeuxiemeOnglet() {
	JPanel j1=new JPanel();
    return j1;
    }
public Component contenuTroisiemeOnglet() {
	JPanel j1=new JPanel();
    return j1;
    }
 public void actionPerformed (ActionEvent e)
  {
	if (e.getSource()==ajouter)
	{
	livres.append(saisieTitre.getText()+" "+saisieAuteur.getText()+" "+saisieISBN.getText()+"\n");
	} 
	else if (e.getSource()==quitter)
	System.exit(0);
  }
 public static void main(String[] args) 
 {
     JFrame frame = new JFrame("Gestion des livres");
     frame.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent e) {System.exit(0);}
        });
     frame.getContentPane().add(new TabbedPaneDemo1(), BorderLayout.CENTER);
     frame.setSize(600,300);
     frame.setVisible(true);
  
}

}

