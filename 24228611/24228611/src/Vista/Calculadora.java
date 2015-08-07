package Vista;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame{

	
	private static final long serialVersionUID = -1683049540705434541L;
	
	JMenuBar menu = null;
	JMenu opciones = null;
	JMenuItem calculadora, salir = null;
	
	JPanel panel = null;
	JLabel inicio, a, b, c, r1, r2 = null;
	JTextField txta, txtb, txtc, txtr1, txtr2 = null;
	JButton calcular = null;

	public Calculadora(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setLocation(400,300);
		this.setSize(230,300);
		this.setTitle("Ecuacion de Segundo Grado");
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
			panel.add(getA(), null);
			panel.add(gettxtA(), null);
			panel.add(getB(), null);
			panel.add(gettxtB(), null);
			panel.add(getC(), null);
			panel.add(gettxtC(), null);
			panel.add(btnCalcular(), null);
			panel.add(getR1(), null);
			panel.add(gettxtR1(), null);
			panel.add(getR2(), null);
			panel.add(gettxtR2(), null);
		}
		return panel;
	}
	
	private JLabel getInicio(){
		if (inicio == null){
			inicio = new JLabel();
			inicio.setText("Ecuacion de Segundo Grado");
			inicio.setBounds(new Rectangle(10,10,200,20));
		}
		return inicio;
	}
	
	private JLabel getA(){
		if (a == null){
			a = new JLabel();
			a.setText("Valor A:");
			a.setBounds(new Rectangle(10,50,100,20));
		}
		return a;
	}
	
	private JTextField gettxtA(){
		if (txta == null){
			txta = new JTextField();
			txta.setBounds(new Rectangle(60,50,100,20));
		}
		return txta;
	}
	
	private JLabel getB(){
		if (b == null){
			b = new JLabel();
			b.setText("Valor B:");
			b.setBounds(new Rectangle(10,70,100,20));
		}
		return b;
	}
	
	private JTextField gettxtB(){
		if (txtb == null){
			txtb = new JTextField();
			txtb.setBounds(new Rectangle(60,70,100,20));
		}
		return txtb;
	}
	
	private JLabel getC(){
		if (c == null){
			c = new JLabel();
			c.setText("Valor C:");
			c.setBounds(new Rectangle(10,90,100,20));
		}
		return c;
	}
	
	private JTextField gettxtC(){
		if (txtc == null){
			txtc = new JTextField();
			txtc.setBounds(new Rectangle(60,90,100,20));
		}
		return txtc;
	}
	
	private JButton btnCalcular(){
		if (calcular == null){
			calcular = new JButton();
			calcular.setText("Calcular");
			calcular.setBounds(new Rectangle(50,130,100,20));
			
			 calcular.addMouseListener(new MouseAdapter() {
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   
					   double x1, x2, x3, x4, x5;
					   String resp1, resp2;
					   
					   double at = Double.parseDouble(txta.getText());
					   double bt = Double.parseDouble(txtb.getText());
					   double ct = Double.parseDouble(txtc.getText());
					   
					   if (at != 0){
						   x1=(-bt);
						   x2=(Math.sqrt(Math.pow(bt, 2))-(4*at*ct));
						   x3=(2*at);
						   
						   x4=((x1+x2)/x3);
						   x5=((x1-x2)/x3);
						   
						   resp1 = String.valueOf(x4);
						   txtr1.setText(resp1);
						   
						   resp2 = String.valueOf(x5);
						   txtr2.setText(resp2);
					   }
					   else
						   JOptionPane.showMessageDialog(null, "Valor A debe ser distinto de cero(0)", "Mensaje de Error", 0);
					   txta.setText(null);
					   txtb.setText(null);
					   txtc.setText(null);
				   }
			   });
			
		}
		return calcular;
	}
	
	
	private JLabel getR1(){
		if (r1 == null){
			r1 = new JLabel();
			r1.setText("Resultado 1:");
			r1.setBounds(new Rectangle(5,160,100,20));
		}
		return r1;
	}
	
	private JTextField gettxtR1(){
		if (txtr1 == null){
			txtr1 = new JTextField();
			txtr1.setBounds(new Rectangle(80,160,130,20));
			txtr1.setEditable(false);
		}
		return txtr1;
	}
	
	private JLabel getR2(){
		if (r2 == null){
			r2 = new JLabel();
			r2.setText("Resultado 2:");
			r2.setBounds(new Rectangle(5,185,100,20));
		}
		return r2;
	}
	
	private JTextField gettxtR2(){
		if (txtr2 == null){
			txtr2 = new JTextField();
			txtr2.setBounds(new Rectangle(80,185,130,20));
			txtr2.setEditable(false);
		}
		return txtr2;
	}
	
	//Aqui termina el codigo para el panel

	public static void main(String[] args) {
		Calculadora ventana = new Calculadora();
		ventana.setVisible(true);

	}

}