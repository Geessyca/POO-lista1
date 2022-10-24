package List1;
//Question8
public class AverageSalaryReceived {
	 public static void main(String args[]) {
		 int quantityOfSalary=0;
		 double salary=0, medium=0;
		 System.out.printf("Digite o valor -1 quando todos salarios forem inseridos!\n");
		 while(salary != -1) {
		     salary = GetUserUtils.getNumberDouble("Informe o valor do salarios: ");
		     medium=medium+salary;
		     quantityOfSalary++;
		 }
		 System.out.print("A media dos salarios é: "+(medium+1)/(quantityOfSalary-1));
	     
	  }
}
