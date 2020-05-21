package TareaJava_Semana3.Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Ejercicio_2 {

	private JFrame frame;
	private JTextField txtValor1;
	private JTextField txtValor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2 window = new Ejercicio_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00E1lculo de \u00C1reas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 531, 34);
			
		JLabel lblNewLabel_1 = new JLabel("Seleccione figura");
		lblNewLabel_1.setBounds(58, 81, 138, 27);
		
		JComboBox cboFiguras = new JComboBox();
		cboFiguras.setBounds(204, 81, 251, 27);
		
		cboFiguras.addItem("Triangulo");
		cboFiguras.addItem("Rectangulo");
		cboFiguras.addItem("Cuadrado");
		
		JLabel lblValor1 = new JLabel("Ingrese valor base:");
		lblValor1.setBounds(58, 159, 138, 27);
		
		JLabel lblValor2 = new JLabel("Ingrese valor altura");
		lblValor2.setBounds(58, 210, 138, 27);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(204, 162, 110, 20);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setColumns(10);
		txtValor2.setBounds(204, 213, 110, 20);
		
		
	
		
		/*cboFiguras.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if (cboFiguras.getSelectedItem()=="Cuadrado") {
					txtValor1.setVisible(true);
					txtValor2.setVisible(false);
					lblValor1.setVisible(false);
					
					lblValor1.setText("Ingrese valor de lado del cuadrado:");
					lblValor2.setVisible(false);
					txtValor2.setVisible(false);
				}
				if (cboFiguras.getSelectedItem()=="Triangulo") {
					txtValor1.setVisible(true);
					txtValor2.setVisible(true);
					lblValor1.setVisible(true);
					
					lblValor1.setText("Ingrese valor de la altura:");
					lblValor1.setText("Ingrese valor de la base:");
					txtValor2.setVisible(true);
				}
				 if( cboFiguras.getSelectedItem()=="Rectangulo") {
					 txtValor1.setVisible(true);
						txtValor2.setVisible(true);
						lblValor1.setVisible(true);
						
						lblValor1.setText("Ingrese valor de la altura:");
						lblValor1.setText("Ingrese valor de la base:");
						txtValor2.setVisible(true); 
				 }
			}
				 
		});*/
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cboFiguras.getSelectedItem()=="Triangulo") {
					
					Triangulo triangulo = new Triangulo();
					JOptionPane.showMessageDialog(null, "El área del triángulo es de: " + triangulo.calcularArea(Integer.parseInt(txtValor1.getText()), Integer.parseInt(txtValor2.getText())));
					
				}else if(cboFiguras.getSelectedItem()=="Cuadrado") {			
					Cuadrilatero cuadrado = new Cuadrilatero();
					JOptionPane.showMessageDialog(null, "El área del cuadrado es de: " + cuadrado.calcularArea(Integer.parseInt(txtValor1.getText()), 0));
					
				}else if(cboFiguras.getSelectedItem()=="Rectangulo" ) {
					Cuadrilatero rectangulo = new Cuadrilatero();					
					JOptionPane.showMessageDialog(null, "El área del rectángulo es de: " + rectangulo.calcularArea(Integer.parseInt(txtValor1.getText()), Integer.parseInt(txtValor2.getText())));
					
				}
			}
		});
		btnNewButton.setBounds(345, 159, 110, 74);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(cboFiguras);
		frame.getContentPane().add(lblValor1);
		frame.getContentPane().add(lblValor2);
		frame.getContentPane().add(txtValor1);
		frame.getContentPane().add(txtValor2);
		frame.getContentPane().add(btnNewButton);
	}
}
