package exercicioss;

import javax.swing.JOptionPane;

public class OrdemInversa {

    public static void main(String[] args) {
    	inverter();
    }
    public static String inverter() {
    	String valor ;
    	valor = JOptionPane.showInputDialog("Digite:");
    	
    	for (int i = valor.length() - 1; i >= 0 ; i--){

			System.out.println(valor.charAt(i));

			}
		return valor;
    }

   
}