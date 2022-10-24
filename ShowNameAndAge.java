package List1;
//Questao1
public class ShowNameAndAge {
	private static GetUserUtils getUser = new GetUserUtils();;
	 
	public static void main(String args[]) {
	      System.out.println(getUser.getText("Informe seu nome:") +", sua idade é:"+ GetUserUtils.getNumberInt("Informe sua idade:"));
	    }
}
