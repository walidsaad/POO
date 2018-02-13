



	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	 class PanelDemo1 extends JFrame implements ActionListener
	{
	 private JTextField saisieAuteur=new JTextField(20);
	 private JTextField saisieTitre=new JTextField(20);
	 private JTextField saisieISBN=new JTextField(20);
	 JPanel ajoutlivre= new JPanel();
	 JPanel listlivre=new JPanel();
	 JLabel auteur=new JLabel("Auteur");
	 JLabel titre=new JLabel("Titre");
	 JLabel isbn=new JLabel("ISBN");
	 JButton ajouter=new JButton("Ajouter");
	 JButton quitter=new JButton("Quitter");
	 JButton afficher=new JButton("Afficher");

	 JTextArea livres =new JTextArea();

	 public PanelDemo1()
	 {super("Saisie de l'auteur du livre");
	  this.setSize(600,400);
	  
	 addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	 ajoutlivre.setLayout(new  GridLayout(4, 1, 0, 5));
	 ajoutlivre.add(titre);ajoutlivre.add(saisieTitre);
	 ajoutlivre.add(auteur); ajoutlivre.add(saisieAuteur);
	 ajoutlivre.add(isbn); ajoutlivre.add(saisieISBN);
	//on utilise le composant Box pour ajuster l'affichage
	 Box ajouterBox=Box.createVerticalBox();
	 ajouterBox.add(ajouter);
	 ajoutlivre.add(ajouterBox);
	 ajoutlivre.setBorder(BorderFactory.createTitledBorder("Ajout d'un livre"));
     this.add( ajoutlivre,BorderLayout.NORTH);
     //on utilise le composant Box pour ajuster l'affichage
	 listlivre.setLayout(new GridLayout(2, 1, 0, 3));
	 Box livreBox=Box.createVerticalBox();
	 livreBox.add(livres);
	 livreBox.add(quitter);
	 listlivre.add(livreBox);
	 listlivre.setBorder(BorderFactory.createTitledBorder("Liste des livres"));
	 this.add( listlivre,BorderLayout.CENTER);
	 ajouter.addActionListener(this);
	 quitter.addActionListener(this);
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
	public static void main(String arg[])
	{
		PanelDemo1 test=new PanelDemo1();
	    test.setVisible(true);
	 }
	}
