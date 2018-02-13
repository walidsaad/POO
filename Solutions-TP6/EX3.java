



	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	 class DS1 extends JFrame
	{
	 private JTextField afficher=new JTextField(20);
	 JButton b1=new JButton("0");
	 JButton b2=new JButton("1");
	 JButton b3=new JButton("2");
	 JButton b4=new JButton("3");
	 JButton b5=new JButton("4");
	 JButton b6=new JButton("5");
	 JButton b7=new JButton("6");
	 JButton b8=new JButton("7");
	 JButton b9=new JButton("8");
	 JButton b10=new JButton("9");
	 JButton b11=new JButton("+");
	 JButton b12=new JButton("-");
	 JButton b13=new JButton("/");
	 JButton b14=new JButton("*");
	 JButton b15=new JButton("%");
	 JButton b16=new JButton("=");
	 JPanel cal = new JPanel();
	
	 public DS1()
	 {super("Calculatrice");
	  this.setSize(300,300);
	 cal.setLayout(new  GridLayout(4, 1, 0, 5));
     this.add( afficher,BorderLayout.NORTH);
     cal.add(b1);
     cal.add(b2);
     cal.add(b3);
     cal.add(b4);
     cal.add(b5);
     cal.add(b6);
     cal.add(b7);
     cal.add(b8);
     cal.add(b9);
     cal.add(b10);
     cal.add(b11);
     cal.add(b12);
     cal.add(b13);
     cal.add(b14);
     cal.add(b15);
     cal.add(b16);
     this.add(cal,BorderLayout.CENTER);
	}
	public static void main(String arg[])
	{
		DS1 test=new DS1();
	    test.setVisible(true);
	 }
	}
