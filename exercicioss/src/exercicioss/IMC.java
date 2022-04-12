package exercicioss;
import javax.swing.JOptionPane;
public class IMC {
	
	   public static void main(String[] args) 
	   {
		  String sexo;
	      String nome;
	      float peso, altura, imc;
	      String classifica = "";
	 
	      sexo = JOptionPane.showInputDialog("Sexo da Pessoa: M ou F");
	      nome = JOptionPane.showInputDialog("Nome da Pessoa:");
	      peso = Float.parseFloat(JOptionPane.showInputDialog("Peso da Pessoa(kg):"));
	      altura = Float.parseFloat(JOptionPane.showInputDialog("Altura da Pessoa(m):") );
	      imc = (float) (peso/Math.pow(altura, 2));
	 
	      JOptionPane.showMessageDialog(null, "IMC de "+ nome +" = "+ imc +" - "+result(imc, classifica, sexo));

	   }
	   
	   public static String result(float imc , String classifica, String sexo) {
		   if (imc < 19.1 && sexo == "F" || imc < 20.7 && sexo == "M" ) {
		    	  classifica = "Abaixo do Peso";
		      }
		      else if (imc < 25.8 && sexo == "F" || imc < 26.4 && sexo == "M" ) {
		          classifica = "Peso ideal";
		      }   
		      else if (imc < 27.3 && sexo == "F" || imc < 27.8 && sexo == "M" ) {
		    	  classifica = "Acima do Peso";
		      }      
		      else if (imc < 32.3 && sexo == "F" || imc < 31.1 && sexo == "M" ) {
		          classifica = "Obesidade Leve";
		      }
		      else {
		          classifica = "Obesidade";
		      }
		return classifica;
		     
		      
	   }

}
