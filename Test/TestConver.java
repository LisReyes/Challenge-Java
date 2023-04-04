package Test;


import javax.swing.JOptionPane;

import Class.*;

public class TestConver {
	
	public static boolean isNumber(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
	
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		
		//Matente escuchando
		while(true) {
			String options = (JOptionPane.showInputDialog(null,"Seleccione la opción de converción de moneda","Menú",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda", "Aqui va el de temperatura"}, "Selección")).toString(); //Convertimos todo este Object en un Strin par apoder manipularlo en nuestro switch
			
			switch(options) {
				case "Conversor de Moneda":
					String input = JOptionPane.showInputDialog("Ingreese la cantidad de dinero que deaseas convertir ");
					if(isNumber(input) == true) {
						// creamos una variable auxiliar para no perder nuestro valor origianl de entrada
						double MyInput = Double.parseDouble(input);
						cc.ChangeCoins(MyInput);
						
						int answer = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						if(JOptionPane.OK_OPTION == answer) {
							System.out.println("Confirmo");
						}else {
							JOptionPane.showConfirmDialog(null, "Programa terminado. Adios.");
							System.exit(answer);
						}
					}else {
						JOptionPane.showConfirmDialog(null, "Error ingrese una selección valida ");
					}
				break;
			}
		}
	}
}
