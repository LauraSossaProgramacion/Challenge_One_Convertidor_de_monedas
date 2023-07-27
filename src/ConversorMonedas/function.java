package ConversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras","De Pesos Colombianos a Yen","De Pesos Colombianos a Won Coreano","De Dólar a Pesos Colombianos", "De Euro a Pesos Colombianos", "De Libras a Pesos Colombianos","De Yen a Pesos Colombianos","De Won Coreano a Pesos Colombianos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos Colombianos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos Colombianos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos Colombianos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos Colombianos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos Colombianos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos Colombianos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos Colombianos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos Colombianos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos Colombianos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos Colombianos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}
