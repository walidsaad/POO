



	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	 class DS1Ex2 extends JFrame
	{
	 private JTextField saisieNom=new JTextField(20);
	 private JTextField saisiePrenom=new JTextField(20);
	 private JTextField saisieDN=new JTextField(20);
	 private JTextField saisieEmail=new JTextField(20);
	 private JTextField saisieMDP1=new JTextField(20);
	 private JTextField saisieMDP2=new JTextField(20);
	 JPanel inscription= new JPanel();
	 JLabel nom=new JLabel("Nom");
	 JLabel prenom=new JLabel("Prénom");
	 JLabel dn=new JLabel("Date de Naissance");
	 JLabel email=new JLabel("Adresse Email");
	 JLabel mdp1=new JLabel("Mot de Passe");
	 JLabel mdp2=new JLabel("Confirmer Mot de Passe");
	 JButton annuler=new JButton("Effacer Formulaire");
	 JButton ajouter=new JButton("Valider Votre Inscription");

	 JTextArea livres =new JTextArea();

	 public DS1Ex2()
	 {super("Nouvelle Inscription");
	  this.setSize(600,400);
	  
	 addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	 inscription.setLayout(new  GridLayout(3, 4, 1, 2));
	 inscription.add(nom);inscription.add(saisieNom);
	 inscription.add(prenom); inscription.add(saisiePrenom);
	 inscription.add(dn); inscription.add(saisieDN);
	 inscription.add(email); inscription.add(saisieEmail);
	 inscription.add(mdp1); inscription.add(saisieMDP1);
	 inscription.add(mdp2); inscription.add(saisieMDP2);
	//on utilise le composant Box pour ajuster l'affichage
	 Box boutonsBox=Box.createHorizontalBox();
	 boutonsBox.add(annuler);
	 boutonsBox.add(ajouter);
	
	 inscription.setBorder(BorderFactory.createTitledBorder("Formulaire d'inscription"));
     this.add( inscription,BorderLayout.NORTH);
     this.add(boutonsBox,BorderLayout.CENTER);

	}
	public static void main(String arg[])
	{
		DS1Ex2 test=new DS1Ex2();
	    test.setVisible(true);
	 }
	}
