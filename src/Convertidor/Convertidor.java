package Convertidor;

import javax.swing.JOptionPane;
import ConversorMonedas.function;
import ConversorTemperatura.functionTemperatura;
import gui.VentanaConvertidor;

public class Convertidor {
	public static void main (String[] args) {
		presentarVentana();
        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();
         
        /*while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

        	switch(opciones) {
        	case "Conversor de Moneda":
        		 String entrada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                 if(ValidarNumero(entrada) == true) {
                     double Minput = Double.parseDouble(entrada);
                     monedas.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Convertidor de Monedas ONE terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;
                     	
                     	
        	 case "Conversor de Temperatura":
            	 entrada = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                 if(ValidarNumero(entrada) == true) {
                     double Minput = Double.parseDouble(entrada);
                     temperatura.ConvertirTemperatura(Minput);

                     int respuesta = 0;
                     respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                     if((respuesta == 0) && (ValidarNumero(entrada) == true)) { 
                     } else {
                         JOptionPane.showMessageDialog(null, "Programa terminado");                     
                     }

                 } else {
                     JOptionPane.showMessageDialog(null, "Valor inválido");                
                 }
                 break;
            }                
        }*/            	        
  }
    private static void presentarVentana() {
    	VentanaConvertidor miVentana=new VentanaConvertidor();
		miVentana.setVisible(true);
	}
	public static boolean ValidarNumero(String entrada) {
        try {
            double x = Double.parseDouble(entrada);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
        	

