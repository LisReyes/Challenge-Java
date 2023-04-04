package Class;

import javax.swing.JOptionPane;

public class ForeignCoin {
double coin;
	
	public void DollarTomex(double coin) {		
		double mexDolar = coin * 18.50;
		mexDolar = (double) Math.round(mexDolar *100d)/100; // reducimos los decimales
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+" dólar " + " a mx es: "+mexDolar);
	}
	
	public void EuroToMex(double coin) {
		double mexEuro = coin * 19.59;
		mexEuro = (double) Math.round(mexEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+" euro " + " a mx es: "+mexEuro);
	}
	
	public void LEToMex (double coin) {
		double mexLE = coin * 22.21;
		mexLE = (double) Math.round(mexLE * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+" Libra " + " a mx es: "+mexLE);
	}
	
	public void YenToMex (double coin) {
		double mexYen = coin * 0.14;
		mexYen = (double) Math.round(mexYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+" Yen " + " a mx es: "+mexYen);		
	}
	
	public void WSCToMex (double coin) {
		double mexWSC = coin * 0.014;
		mexWSC = (double) Math.round(mexWSC * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+" Won " + " a mx es: "+mexWSC);
	}
}
