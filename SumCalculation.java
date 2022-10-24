package List1;
//Question5
 class SumCalculation {
	 public static void main(String args[]) {
		 int valueByUser,valueByUserueAux=0;
		 valueByUser = GetUserUtils.getNumberInt("Informe o valor de parada do somatorio:");
		 for(int i=1;i<=valueByUser;i++) {
		 	  valueByUserueAux=(valueByUserueAux+i);
		 }
		 System.out.println("O somatorio de "+valueByUser+" é: "+valueByUserueAux);
	 }
}
