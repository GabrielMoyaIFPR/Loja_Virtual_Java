package exercicioss;

import javax.swing.JOptionPane;

public class Idade {

    public static void main(String[] args) {
    
    	String idade = "";
    	idade = JOptionPane.showInputDialog("Digite sua idade:");
    	int number = Integer.parseInt(idade);   	
    	
    	if(number <= 12) {
    		JOptionPane.showMessageDialog(null, "Sua idade " + number + " e de uma criança");
    	}
    	else if(number > 12 && number < 18) {
    		JOptionPane.showMessageDialog(null, "Sua idade " + number + " e de um adolescente");
    	}
    	else if(number > 18 && number < 60) {
    		JOptionPane.showMessageDialog(null, "Sua idade " + number + " e de um adulto");
    	}
    	else if(number >= 60) {
    		JOptionPane.showMessageDialog(null, "Sua idade " + number + " e de um idoso");
    	}
    }

   
}