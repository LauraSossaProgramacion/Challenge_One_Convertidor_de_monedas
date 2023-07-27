package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class VentanaConvertidor extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	JButton btnConvertidorMonedas,btnConvertidorTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConvertidor frame = new VentanaConvertidor();
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
	public VentanaConvertidor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		setTitle("Ventana Conversor ONE");
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 322);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		
		JLabel lblTitulo = new JLabel("Convertidor Challenge ONE");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Raleway Medium", Font.BOLD, 18));
		lblTitulo.setBounds(10, 23, 424, 41);
		panelPrincipal.add(lblTitulo);
		
		btnConvertidorMonedas = new JButton("¿Convertidor de Monedas?");
		btnConvertidorMonedas.setFont(new Font("Oswald", Font.BOLD, 16));
		btnConvertidorMonedas.setBounds(115, 156, 213, 37);
		btnConvertidorMonedas.addActionListener(this);
		panelPrincipal.add(btnConvertidorMonedas);
		
		
		btnConvertidorTemperatura = new JButton("¿Convertidor de Temperatura?");
		btnConvertidorTemperatura.setFont(new Font("Oswald", Font.BOLD, 16));
		btnConvertidorTemperatura.setBounds(93, 204, 266, 37);
		btnConvertidorTemperatura.addActionListener(this);
		panelPrincipal.add(btnConvertidorTemperatura);
		
		JTextArea txtrbienvenidoAlConvertidor = new JTextArea();
		txtrbienvenidoAlConvertidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrbienvenidoAlConvertidor.setText("!Bienvenido al Convertidor del Challenge de ONE!");
		txtrbienvenidoAlConvertidor.setBounds(48, 76, 354, 22);
		panelPrincipal.add(txtrbienvenidoAlConvertidor);
		
		JTextArea txtrqueConvertidorDeseas = new JTextArea();
		txtrqueConvertidorDeseas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrqueConvertidorDeseas.setText("¿Que Convertidor deseas Usar?");
		txtrqueConvertidorDeseas.setBounds(115, 109, 227, 22);
		panelPrincipal.add(txtrqueConvertidorDeseas);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvertidorMonedas==e.getSource()) {
			JOptionPane.showConfirmDialog(null, "Convertir Monedas");
			VentanaMonedas ventanaMonedas=new VentanaMonedas();
			ventanaMonedas.setVisible(true);
			this.dispose();
		}
		if(btnConvertidorTemperatura==e.getSource()) {
			JOptionPane.showConfirmDialog(null, "Convertir Temperaturas");
			VentanaTemperatura ventanaTemperatura=new VentanaTemperatura();
			ventanaTemperatura.setVisible(true);
			this.dispose();
		}
	}
}
