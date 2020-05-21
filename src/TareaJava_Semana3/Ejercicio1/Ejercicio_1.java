package TareaJava_Semana3.Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_1 {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1 window = new Ejercicio_1();
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
	public Ejercicio_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ButtonGroup btngrp = new ButtonGroup();
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(137, 46, 76, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Apellido");
		label_1.setBounds(137, 99, 76, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Sexo");
		label_2.setBounds(137, 147, 63, 14);
		frame.getContentPane().add(label_2);
		
		JRadioButton rdFemenino = new JRadioButton("Femenino");
		rdFemenino.setBounds(309, 143, 120, 23);
		frame.getContentPane().add(rdFemenino);
		
		JRadioButton rdMasculino = new JRadioButton("Masculino");
		rdMasculino.setBounds(206, 143, 101, 23);
		frame.getContentPane().add(rdMasculino);
		
		btngrp.add(rdMasculino);
		btngrp.add(rdFemenino);
		
		JLabel label_3 = new JLabel("Descripci\u00F3n");
		label_3.setBounds(137, 197, 107, 14);
		frame.getContentPane().add(label_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 4, 22);
		frame.getContentPane().add(textArea);
				
		txtNombre = new JTextField();
		txtNombre.setBounds(206, 43, 170, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(206, 96, 170, 20);
		frame.getContentPane().add(txtApellido);
		
		JTextArea txtDesc = new JTextArea();
		txtDesc.setBounds(147, 232, 243, 55);
		frame.getContentPane().add(txtDesc);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || rdFemenino.isSelected() == false && rdMasculino.isSelected() == false){
					JOptionPane.showMessageDialog(null, "Debe completar los datos requeridos");
				}else {
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
				}
				
			}
		});
		btnGuardar.setBounds(346, 336, 107, 23);
		frame.getContentPane().add(btnGuardar);
		
	}
}
