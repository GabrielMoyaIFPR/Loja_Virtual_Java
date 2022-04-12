package exercicioss;

import java.util.Arrays;
import java.util.Scanner;


public class OrdemCrescente {
	public static void main(String[] args)
	{

	Scanner numeros = new Scanner(System.in);

	int[] listaDeNumeros = new int[5];
	           
	           for (int i = 0; i < listaDeNumeros.length; i++) 
	           {
		           System.out.print("Digite o "+ (i+1) + "° numero: "); 
		           listaDeNumeros[i] = (numeros.nextInt());
		       }
	           
	           Arrays.sort(listaDeNumeros);
	           
	          System.out.print("Ordem crescente:    "); 
	       	  for (int j = 0; j < listaDeNumeros.length; j++) 
	       	  {
	       		System.out.print(listaDeNumeros[j]+ "  ");       		
			  }
	       	  
	       	           
	        	 
	}
}
