package List1;
//Question9
public class KilometerPerLiterRelation {
	 public static void main(String args[]) {
		 int kmQuantity, literQuantity, startProgram=1;
		 while(startProgram != 0) {
			kmQuantity = GetUserUtils.getNumberInt("Digite quantos quilômetros foram percorridos: ");
			literQuantity = GetUserUtils.getNumberInt("Digite quantos litros foram gastos: ");
		    float relation = ((float)kmQuantity/literQuantity);
		    startProgram = GetUserUtils.getNumberInt("\nForam percorridos " + relation + " quilometros por litro!\nDigite 0 para encerrar o programa e 1 para realizar outro calculo: ");
		    System.out.printf("\n\n");
		 }	  
		 System.out.printf("Programa Encerrado!");
	  }
}
