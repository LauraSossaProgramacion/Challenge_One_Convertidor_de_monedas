package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConversorMonedas.ConvertirMonedas;
import ConversorMonedas.ConvertirMonedasAPesos;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaMonedas extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnRegresarConversorMonedas;
	private JLabel valor;
	private JTextField entradaMoneda;
	JComboBox comboBoxMoneda;
	String entrada;
	//double entradaMonedas;
	JButton btnconvertirMoneda;
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMonedas frame = new VentanaMonedas();
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
	public VentanaMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrIngresaLaCantidad = new JTextArea();
		txtrIngresaLaCantidad.setFont(new Font("Oswald", Font.PLAIN, 18));
		txtrIngresaLaCantidad.setBounds(48, 10, 347, 31);
		txtrIngresaLaCantidad.setText("Ingresa la cantidad de dinero que deseas convertir: ");
		contentPane.add(txtrIngresaLaCantidad);
		
		btnRegresarConversorMonedas = new JButton("Regresar al conversor ONE");
		btnRegresarConversorMonedas.setBounds(196, 227, 228, 23);
		btnRegresarConversorMonedas.addActionListener(this);
		contentPane.add(btnRegresarConversorMonedas);
		
		valor = new JLabel("Valor: ");
		valor.setBounds(84, 52, 46, 14);
		contentPane.add(valor);
		
		entradaMoneda = new JTextField();
		entradaMoneda.setBounds(188, 49, 121, 20);
		contentPane.add(entradaMoneda);
		
		entradaMoneda.setColumns(10);
		
	    comboBoxMoneda = new JComboBox();
		comboBoxMoneda.setModel(new DefaultComboBoxModel(new String[] {"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras Esterlinas", "De Pesos Colombianos a Yen Japonés", "De Pesos Colombianos a Won sul-coreano", "De Dólar a Pesos Colombianos", "De Euros a Pesos Colombianos", "De Libras Esterlinas a Pesos Colombianos", "De Yen Japonés a Pesos Colombianos", "De Won sul-coreano  a Pesos Colombianos"}));
		comboBoxMoneda.setToolTipText("");
		comboBoxMoneda.setBounds(84, 102, 228, 22);
		contentPane.add(comboBoxMoneda);
		
		JLabel lblNewLabel = new JLabel("Elija la conversion a realizar:");
		lblNewLabel.setBounds(84, 77, 200, 14);
		contentPane.add(lblNewLabel);
		
		btnconvertirMoneda = new JButton("CONVERTIR");
		btnconvertirMoneda.setFont(new Font("Oswald", Font.BOLD, 24));
		btnconvertirMoneda.setBounds(142, 159, 182, 36);
		btnconvertirMoneda.addActionListener(this);
		contentPane.add(btnconvertirMoneda);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaConvertidor ventanaMonedas=new VentanaConvertidor();
		ventanaMonedas.setVisible(true);
		this.dispose();

			if(btnconvertirMoneda==e.getSource()) {
			entrada=comboBoxMoneda.getSelectedItem().toString();
			double entradaMonedas=Double.parseDouble(entradaMoneda.getText());
			
			if(entrada=="De Pesos Colombianos a Dólar") {
				double monedaDolar = entradaMonedas/3949.19;
				monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
			}if(entrada=="De Pesos Colombianos a Euro") {
				double monedaEuro = entradaMonedas / 4381.32;
				monedaEuro = (double) Math.round(monedaEuro *100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
			}if(entrada=="De Pesos Colombianos a Libras Esterlinas") {
				double monedaLibra = entradaMonedas / 5115.11;
		        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
			}if(entrada=="De Pesos Colombianos a Yen Japonés") {
				double monedaYen = entradaMonedas /28.17;
		        monedaYen = (double) Math.round(monedaYen *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
			}if(entrada=="De Pesos Colombianos a Won sul-coreano") {
				double monedaWon = entradaMonedas / 3.11 ;
		        monedaWon = (double) Math.round(monedaWon *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
			}if(entrada=="De Dólar a Pesos Colombianos") {
		        double monedaDolar =entradaMonedas * 3949.19;
				monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
			}if(entrada=="De Euros a Pesos Colombianos") {
				double monedaEuro =entradaMonedas * 4381.32;
				monedaEuro = (double) Math.round(monedaEuro *100d)/100;
				JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
			}if(entrada=="De Libras Esterlinas a Pesos Colombianos") {
				double monedaLibra = entradaMonedas * 5115.11;
		        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
			}if(entrada=="De Yen Japonés a Pesos Colombianos") {
				double monedaYen = entradaMonedas * 28.17;
		        monedaYen = (double) Math.round(monedaYen *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
			}if(entrada=="De Won sul-coreano  a Pesos Colombianos") {
				double monedaWon = entradaMonedas * 3.11;
		        monedaWon = (double) Math.round(monedaWon *100d)/100;
		        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
			
				//JOptionPane.showMessageDialog(null, "Tienes $ " +entradaMonedas+ " Dolares");
			}else {
				//JOptionPane.showMessageDialog(null, "seleccionaste euros");
			}
			
			}	
		}
	}
	
		
	

