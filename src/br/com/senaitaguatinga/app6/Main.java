package br.com.senaitaguatinga.app6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		PrecoTotal bo = new PrecoTotal();

		double resp1 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitario: "));
		double resp2 = Double.parseDouble(JOptionPane.showInputDialog("Valor pre�o: "));
		
		JOptionPane.showMessageDialog(null, "O valor total ser� de: "+ bo.precoTotal(resp1, resp2));
	}

}
