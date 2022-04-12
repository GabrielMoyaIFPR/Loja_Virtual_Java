package exercicioss;

import javax.swing.JOptionPane;

public class Salario {
	 public static void main(String[] args) 
	   {
		  float hora, qhora, salarioBruto, fgts, sind, salarioLiquido = 0, ir = 0;
	 
	      hora = Float.parseFloat(JOptionPane.showInputDialog("Valor da Hora:"));
	      qhora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Horas:") );
	      salarioBruto = hora * qhora;
	      fgts = (salarioBruto * 11) / 100;
	      sind = (salarioBruto * 3) / 100;
	      JOptionPane.showMessageDialog(null, "Salario Bruto= "+ salarioBruto  + " SIND= " + sind + 
	    		   " Salario Liquido= " + +result(salarioBruto, salarioLiquido, sind, ir) +" FGTS= "+ fgts);
	   }
	 
	 public static float result(float salarioBruto, float salarioLiquido, float sind, float ir) {
		
		 if(salarioBruto<= 900) {
			 salarioLiquido = salarioBruto - sind;
		 }
		 else if (salarioBruto >900 && salarioBruto <= 1500) {
			 ir = (salarioBruto * 5) / 100;
			 salarioLiquido = salarioBruto - ir - sind;
		 }
		 else if (salarioBruto >1500 && salarioBruto <= 2500) {
			 ir = (salarioBruto * 10) / 100;
			 salarioLiquido = salarioBruto - ir - sind;
		 }
		 else  {
			 ir = (salarioBruto * 20) / 100;
			 salarioLiquido = salarioBruto - ir - sind;
		 }
		 
		 return salarioLiquido;
		 
	 }

}
