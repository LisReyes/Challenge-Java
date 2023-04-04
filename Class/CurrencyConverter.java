package Class;

import javax.swing.JOptionPane;
public class CurrencyConverter {
	
	//Instanciamos las clases que convierten las monedas
	NationalCoin coins = new NationalCoin();
	ForeignCoin fcoins = new ForeignCoin();
	
	// Realizamos la interfaz que se encargara de convertir las monedas
	public void ChangeCoins(double MyInput) {
		// leemos la opcion dada por el usuario
		// utilizaremos un menu desplegable
		String opc = (JOptionPane.showInputDialog(null,"Seleccione la moneda a convertir su dinero ","Moneda",JOptionPane.PLAIN_MESSAGE,null,new Object[] {
		"De MX a Dólar ","De MX a Euro","De MX a Libras","De MX a Yen","De MX a Won Coreano","De Dólar a MX","De Euro a MX","De Libras a MX","De Won Coreano a Pesos"}, 		"Selección")).toString();
		
		switch(opc) {
			
			case "De MX a Dólar":
				coins.mexToDollar(MyInput);
			break;
			case "De MX a Euro":
				coins.mexToEuros(MyInput);
			break;
			case "De MX a Libras":
				coins.mexToLE(MyInput);
			break;
			case "De MX a Yen":
				coins.mexToYen(MyInput);
			break;
			case "De MX a Won Coreano":
				coins.mexToWSC(MyInput);
			break;
			case "De Dólar a MX":
				fcoins.DollarTomex(MyInput);
			break;
			case "De Euro a MX":
				fcoins.EuroToMex(MyInput);
			break;
			case "De Libras a MX":
				fcoins.LEToMex(MyInput);
			break;
			case "De Won Coreano a Pesos":
				fcoins.WSCToMex(MyInput);
			break;
			
		}
	}
	
}
