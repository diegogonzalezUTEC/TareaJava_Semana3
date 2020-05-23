package TareaJava_Semana3.Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
public class Ejercicio_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1 frame = new Ejercicio_1();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio_1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(137, 46, 76, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Apellido");
		label_1.setBounds(137, 99, 76, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Sexo");
		label_2.setBounds(137, 147, 63, 14);
		getContentPane().add(label_2);
		
		JRadioButton rdFemenino = new JRadioButton("Femenino");
		rdFemenino.setBounds(309, 143, 120, 23);
		getContentPane().add(rdFemenino);
		
		JRadioButton rdMasculino = new JRadioButton("Masculino");
		rdMasculino.setBounds(206, 143, 101, 23);
		getContentPane().add(rdMasculino);
		ButtonGroup btngrp = new ButtonGroup();
		btngrp.add(rdMasculino);
		btngrp.add(rdFemenino);
		
		JLabel label_3 = new JLabel("Descripci\u00F3n");
		label_3.setBounds(137, 197, 107, 14);
		getContentPane().add(label_3);
					
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(206, 43, 170, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setBounds(206, 96, 170, 20);
		txtApellido.setColumns(10);
		getContentPane().add(txtApellido);
		
		JTextArea txtDesc = new JTextArea();
		txtDesc.setBounds(208, 182, 221, 74);
		getContentPane().add(txtDesc);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//		if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || rdFemenino.isSelected() == false && rdMasculino.isSelected() == false || txtDesc.getText().equals("")){
							//throw new Exception ("Debe completar los datos requeridos");
						//	JOptionPane.showMessageDialog(null, "Debe completar los datos requeridos");
						//}else {
				try {
					esVacio(txtNombre, txtApellido, rdFemenino, rdMasculino,txtDesc);
					System.out.println("Nombre: " + txtNombre.getText() + "\n" +
									"Apellido: " + txtApellido.getText());
					if(rdFemenino.isSelected()) {
						System.out.println("Sexo: Femenino");
						System.out.println("Descripción: " + txtDesc.getText());
						JOptionPane.showMessageDialog(null, "Nombre: " + txtNombre.getText() + "\n" + "Apellido: " + txtApellido.getText() + "\n" + "Sexo: Femenino" + "\n" + "Descripción: " + txtDesc.getText());
					}else if(rdMasculino.isSelected()) {
						System.out.println("Sexo: Masculino");
						System.out.println("Descripción: " + txtDesc.getText());
						JOptionPane.showMessageDialog(null, "Nombre: " + txtNombre.getText() + "\n" + "Apellido: " + txtApellido.getText() + "\n" + "Sexo: Masculino" + "\n" + "Descripción: " + txtDesc.getText());
					}
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
							
						
			}
		});
		btnGuardar.setBounds(340, 267, 89, 23);
		contentPane.add(btnGuardar);
		
		
	}
	public void esVacio(JTextField nom, JTextField ape, JRadioButton fem, JRadioButton masc, JTextArea txtDesc) throws Exception{
		if (nom.getText().equals("") || ape.getText().equals("") || fem.isSelected() == false && masc.isSelected() == false || txtDesc.getText().equals("")) {
			throw new Exception("Debe completar los datos requeridos");
		}	
	}

}
