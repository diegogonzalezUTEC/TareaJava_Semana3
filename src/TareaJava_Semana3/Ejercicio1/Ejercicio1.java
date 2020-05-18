package TareaJava_Semana3.Ejercicio1;
import java.awt.FlowLayout;

import javax.swing.*;


public class Ejercicio1 extends JFrame{

	public Ejercicio1() {
		JFrame ventana = new JFrame();
		ventana.setSize(600, 450);
		ventana.setLayout(new FlowLayout());
		
		JLabel lblNombre = new JLabel("Nombre: ");
		JTextField txtNombre = new JTextField();
		JLabel lblApellido= new JLabel("Apellido: ");
		JTextField txtApellido = new JTextField();
		JLabel lblSexo = new JLabel("Sexo: ");
		
		ButtonGroup bgGroup = new ButtonGroup();
		
		JRadioButton optMasculino = new JRadioButton("Masculino");
		JRadioButton optFemenino = new JRadioButton("Femenino");
		
		bgGroup.add(optFemenino);
		bgGroup.add(optMasculino);
		
		JLabel lblDescripcion = new JLabel("Descripción: ");
		
		ventana.add(lblNombre);
		ventana.add(lblApellido);
		ventana.add(lblSexo);
		ventana.add(lblDescripcion);
		
		ventana.add(txtNombre);
		ventana.add(txtApellido);
		
		//ventana.add(bgGroup);
		ventana.add(optMasculino);
		ventana.add(optFemenino);
		ventana.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 v = new Ejercicio1();
		
	
	}
	

}
