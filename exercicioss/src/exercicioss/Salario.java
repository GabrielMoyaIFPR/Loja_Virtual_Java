package exercicioss;

import javax.swing.JOptionPane;

public class Salario {
	 public static void main(String[] args) 
	   {
		  float hora, qhora, salarioBruto, fgts, inss, sind, salarioLiquido = 0, ir = 0, descontoTotal=0;
	 
	      hora = Float.parseFloat(JOptionPane.showInputDialog("Valor da Hora:"));
	      qhora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Horas:"));
	      
	      salarioBruto = hora * qhora;
	      fgts = (salarioBruto * 11) / 100;
	      sind = (salarioBruto * 3) / 100;
	      inss = (salarioBruto * 10) / 100;
	      descontoTotal = sind + inss + result( salarioBruto, ir);
	      salarioLiquido = salarioBruto - result( salarioBruto, ir) - sind - inss;
	      
	      JOptionPane.showMessageDialog(null, 
	    		  "Salario Bruto= "+ salarioBruto  +
	    		  " FGTS= "+ fgts +
	    		  " SIND= " + sind +
	    		  " INSS= " + inss +
	    		  " IR = " + result( salarioBruto, ir) +
	    		  " Total de Descontos= " + descontoTotal +
	    		  " Salario Liquido= " + salarioLiquido);
	   }
	 
	 public static float result(float salarioBruto, float ir) {
		
		 if(salarioBruto <= 900) {
			 ir= 0;
		 }
		 else if (salarioBruto >900 && salarioBruto <= 1500) {
			 ir = (salarioBruto * 5) / 100;
		 }
		 else if (salarioBruto >1500 && salarioBruto <= 2500) {
			 ir = (salarioBruto * 10) / 100;
		 }
		 else  {
			 ir = (salarioBruto * 20) / 100;
		 }
		 
		 return ir;
		 
	 }

}
