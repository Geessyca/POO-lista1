package List1;
//Question10
public class BhaskaraCalculation {
	 public static void main(String args[]) {
		 int a,b,c;
		 a = GetUserUtils.getNumberInt("Digite o valor de a: ");
		 b = GetUserUtils.getNumberInt("Digite o valor de b: ");
		 c = GetUserUtils.getNumberInt("Digite o valor de c: ");
		 double squareRoot = ((b*b)+(-4*a*c));
		 if (squareRoot >= 0) {
			 squareRoot=Math.sqrt(squareRoot);
			 System.out.printf("O valor de x1 é: "+((-b+squareRoot)/(2*a))+" e o valor de x2 é: "+((-b-squareRoot)/(2*a)));
		 }
		 else {
			 System.out.printf("Essa equação não possui raiz real!");
		 }
		 
		 
	  }
}
