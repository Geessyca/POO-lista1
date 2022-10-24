package List1;
//Question3
public class ComparisonInTwoNumbers {
	 public static void main(String args[]) {
	      int firstNumber = GetUserUtils.getNumberInt("Informe o primeiro valor:");
	      int secondNumber = GetUserUtils.getNumberInt("Informe o segundo valor:");
      
	      if (firstNumber>secondNumber) {
	    	  System.out.println("O maior é " + firstNumber);
	      }else if (firstNumber<secondNumber) {
	    	  System.out.println("O maior é" + secondNumber);
	      }else {
	    	  System.out.println("Os valores são iguais!");
	      }

	    }
}
