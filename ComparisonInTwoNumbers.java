package List1;
//Question3
public class ComparisonInTwoNumbers {
	 public static void main(String args[]) {
	      int firstNumber = GetUserUtils.getNumberInt("Informe o primeiro valor:");
	      int secondNumber = GetUserUtils.getNumberInt("Informe o segundo valor:");
      
	      if (firstNumber>secondNumber) {
	    	  System.out.println("O maior � " + firstNumber);
	      }else if (firstNumber<secondNumber) {
	    	  System.out.println("O maior �" + secondNumber);
	      }else {
	    	  System.out.println("Os valores s�o iguais!");
	      }

	    }
}
