package Class;

import javax.swing.JOptionPane;

public class NationalCoin {
	
	double coin;
	
	public void mexToDollar(double coin) {		
		double mexDolar = coin / 18.50;
		mexDolar = (double) Math.round(mexDolar *100d)/100; // reducimos los decimales
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+ " a dólar es: "+mexDolar);
	}
	
	public void mexToEuros(double coin) {
		double mexEuro = coin / 19.59;
		mexEuro = (double) Math.round(mexEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+ " a euro es: "+mexEuro);
	}
	
	public void mexToLE (double coin) {
		double mexLE = coin / 22.21;
		mexLE = (double) Math.round(mexLE * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+ " a libra es: "+mexLE);
	}
	
	public void mexToYen (double coin) {
		double mexYen = coin / 0.14;
		mexYen = (double) Math.round(mexYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+ " a Yen es: "+mexYen);;		
	}
	
	public void mexToWSC (double coin) {
		double mexWSC = coin / 0.014;
		mexWSC = (double) Math.round(mexWSC * 100d)/100;
		JOptionPane.showMessageDialog(null, "La conversión de "+coin+ " a Won es: "+mexWSC);
	}
}
