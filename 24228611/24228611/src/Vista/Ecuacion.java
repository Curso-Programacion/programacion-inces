package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ecuacion extends JFrame{

	JLabel a = null;
	JTextField txta = null;
	
	public Ecuacion(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setLocation(200,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ecuaciones");
		this.setSize(300,300);
		
	}
	
	public static void main(String[] args) {
		Ecuacion ventana = new Ecuacion();
		ventana.setVisible(true);

	}

}
