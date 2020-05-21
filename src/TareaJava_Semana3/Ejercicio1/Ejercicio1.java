package TareaJava_Semana3.Ejercicio1;
import java.awt.*;
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;

import javax.swing.*;


public class Ejercicio1 extends JFrame{

	public Ejercicio1() {
		JFrame ventana = new JFrame("Ingreso de datos");
		ventana.setSize(600, 450);
		ventana.setLayout(new BorderLayout());
		
		JLabel lblNombre = new JLabel("Nombre: ");
		JTextField txtNombre = new JTextField();
		txtNombre.setSize(100, 50);
		JLabel lblApellido= new JLabel("Apellido: ");
		JTextField txtApellido = new JTextField();
		txtApellido.setSize(100, 50);
		JLabel lblSexo = new JLabel("Sexo: ");
		
		ButtonGroup bgGroup = new ButtonGroup();
		
		JRadioButton optMasculino = new JRadioButton("Masculino");
		JRadioButton optFemenino = new JRadioButton("Femenino");
		
		bgGroup.add(optFemenino);
		bgGroup.add(optMasculino);
		
		JLabel lblDescripcion = new JLabel("Descripción: ");
		JTextArea txtDesc = new JTextArea();
		txtDesc.setSize(200, 150);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 12));
		
		JPanel panelSur = new JPanel(new BorderLayout());
		panelSur.add(btnAceptar); 
		JPanel panelOeste = new JPanel(new GridLayout(2,1));
		panelOeste.add(lblNombre);
		panelOeste.add(lblApellido);
		panelOeste.add(lblSexo);
		panelOeste.add(lblDescripcion);
		
		JPanel panelCentro = new JPanel(new GridLayout(2,1));
		panelCentro.add(txtNombre);
		panelCentro.add(txtApellido);
		panelCentro.add(optFemenino);
		panelCentro.add(optMasculino);
		panelCentro.add(txtDesc);

		
		ventana.add(panelSur, BorderLayout.SOUTH);
		ventana.add(panelOeste, BorderLayout.WEST);
		ventana.add(panelCentro, BorderLayout.CENTER);
		
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblApellido);
		ventana.add(txtApellido);
		ventana.add(lblSexo);
		//ventana.add(bgGroup);
		ventana.add(optMasculino);
		ventana.add(optFemenino);
		ventana.add(lblDescripcion);
		ventana.add(txtDesc);
		ventana.add(btnAceptar);
		


		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 v = new Ejercicio1();
		
	
	}
	
	
	

}
