
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameDemoMenuBar2 extends JFrame{
    public FrameDemoMenuBar2(){
        //Créer et configurer la fenetre.
        super("FrameDemoMenuBar2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Creer un Menu Bar vide avec un Background vert
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
        this.setJMenuBar(greenMenuBar);
        //Creer un premier Label avec un Background Jaune
        JLabel myLabel = new JLabel("LFIG2 ISAEG 2014-2015");
        myLabel.setOpaque(true);
        myLabel.setBackground(new Color(248, 213, 131));
        myLabel.setPreferredSize(new Dimension(200, 180));
        this.getContentPane().add(myLabel, BorderLayout.NORTH);

        //Afficher la fenetre.
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //Appeler la méthode CreateAndShowGUI() dans un thread.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	FrameDemoMenuBar2 frame = new FrameDemoMenuBar2();
            }
        });
        //Sans thread on fait appel directement à la méthode createAndShowGUI();
    }
}
