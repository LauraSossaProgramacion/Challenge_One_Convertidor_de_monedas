package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaTemperatura extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnRegresarConvertidorTemperatura;
	private JLabel lbltemperatura;
	private JTextField entradaTemperatura;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnConvertirTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTemperatura frame = new VentanaTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrIngresaElValor = new JTextArea();
		txtrIngresaElValor.setBounds(15, 10, 404, 32);
		txtrIngresaElValor.setFont(new Font("Oswald", Font.PLAIN, 18));
		txtrIngresaElValor.setText("Ingresa el valor de la temperatura que deseas convertir :");
		contentPane.add(txtrIngresaElValor);
		
		btnRegresarConvertidorTemperatura = new JButton("Regresar al convertidor de ONE");
		btnRegresarConvertidorTemperatura.setBounds(154, 227, 265, 23);
		btnRegresarConvertidorTemperatura.addActionListener(this);
		contentPane.add(btnRegresarConvertidorTemperatura);
		
		lbltemperatura = new JLabel("Valor: ");
		lbltemperatura.setBounds(88, 56, 46, 14);
		contentPane.add(lbltemperatura);
		
		entradaTemperatura = new JTextField();
		entradaTemperatura.setBounds(165, 53, 146, 20);
		contentPane.add(entradaTemperatura);
		entradaTemperatura.setColumns(10);
		
		lblNewLabel = new JLabel("Elija la conversión a realizar:");
		lblNewLabel.setBounds(88, 81, 197, 14);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius ", "Kelvin  a Grados Celcius", "Kelvin  a Grados Farenheit"}));
		comboBox.setBounds(88, 106, 223, 22);
		contentPane.add(comboBox);
		
		btnConvertirTemperatura = new JButton("CONVERTIR");
		btnConvertirTemperatura.setFont(new Font("Oswald", Font.BOLD, 20));
		btnConvertirTemperatura.setBounds(130, 154, 177, 46);
		contentPane.add(btnConvertirTemperatura);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		VentanaConvertidor ventanaTemperatura=new VentanaConvertidor();
		ventanaTemperatura.setVisible(true);
		this.dispose();
		double entrada=Double.parseDouble(entradaTemperatura.getText());
	}

}
