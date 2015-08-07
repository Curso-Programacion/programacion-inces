package Vista;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ecuacion extends JFrame{

	
	private static final long serialVersionUID = -2673471049723051284L;
	JLabel a = null;
	JTextField txta = null;
	JPanel panel = null;
	
	public Ecuacion(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setLocation(200,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ecuaciones");
		this.setSize(300,300);
		this.setContentPane(Contenedor());
	}
	
	private JPanel Contenedor(){
		if (panel == null){
			panel = new JPanel();
			panel.setLayout(null);
			
			panel.add(getA(), null);
		}
		return panel;
	}
	
	private JLabel getA(){
		if (a == null){
			a = new JLabel();
			a.setText("Valor A:");
			a.setBounds(new Rectangle(10,10,100,20));
		}
		return a;
	}
	
	public static void main(String[] args) {
		Ecuacion ventana = new Ecuacion();
		ventana.setVisible(true);

	}

}