package List1;

//Questao2
public class BasicEquationsInTwoNumbers {
	 public static void main(String args[]) {
	      int firstNumber =  GetUserUtils.getNumberInt("Informe o primeiro numero:");
	      int secondNumber =  GetUserUtils.getNumberInt("Informe o segundo numero:");

	      System.out.println("A soma destes numeros �: " + (firstNumber+secondNumber) + "\n" +
				    		 "A subtacao destes numeros �: " + (firstNumber-secondNumber) + "\n" +
				    		 "A divisao destes numeros �: " + ((double)firstNumber/secondNumber) + "\n" +
				    		 "A multiplicacao destes numeros �: " + (firstNumber*secondNumber) + "\n");
	    }
}
