package Vista;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import sun.net.www.content.image.jpeg;

public class Calculadora extends JFrame{

	
	private static final long serialVersionUID = -1683049540705434541L;
	
	JMenuBar menu = null;
	JMenu opciones = null;
	JMenuItem calculadora, salir = null;
	
	JPanel panel = null;
	JLabel inicio = null;

	public Calculadora(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setLocation(400,200);
		this.setSize(300,300);
		this.setTitle("Ventana Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(MenuContenedor());
		this.setContentPane(Contenedor());
	}
	
	//Inicio del codigo para el menu
	private JMenuBar MenuContenedor(){
		if (menu == null){
			menu = new JMenuBar();
			menu.add(OpcionesMenu());
		}
		return menu;
	}
	
	private JMenu OpcionesMenu(){
		if (opciones == null){
			opciones = new JMenu();
			opciones.setText("Opciones");
			opciones.add(CalculadoraItem());
			opciones.add(SalirItem());
		}
		return opciones;
	}
	
	private JMenuItem CalculadoraItem(){
		if (calculadora == null){
			calculadora = new JMenuItem();
			calculadora.setText("Calculadora");
		}
		return calculadora;
	}
	
	private JMenuItem SalirItem(){
		if (salir == null){
			salir = new JMenuItem();
			salir.setText("Salir");
		}
		return salir;
	}
	//Aqui termina el codigo para el menu
	
	//Aqui empieza el codigo para el panel
	
	private JPanel Contenedor(){
		if (panel == null){
			panel = new JPanel();
			panel.setLayout(null);
			
			panel.add(getInicio(), null);
		}
		return panel;
	}
	
	private JLabel getInicio(){
		if (inicio == null){
			inicio = new JLabel();
			inicio.setText("Seleccione una Operacion");
			inicio.setBounds(new Rectangle(20,10,150,20));
		}
		return inicio;
	}
	
	//Aqui termina el codigo para el panel

	public static void main(String[] args) {
		Calculadora ventana = new Calculadora();
		ventana.setVisible(true);

	}

}
