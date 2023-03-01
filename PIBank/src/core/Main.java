package core;

public class Main {

		  public static void main(String[] args) {
		    
		    Conta c1 = new Conta("NUBIA", "123.456.789-00", 1234345, 1000.0);
		    System.out.println(c1.toString()); 

		  
		    boolean debito1 = c1.debitar(500.0);
		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		    System.out.println("Débito 1: " + debito1); 
		    System.out.println(c1.toString()); 

	
		    c1.creditar(200.0); 
		    System.out.println(c1.toString()); 

		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		    ContaEspecial contaEsp1 = new ContaEspecial("ALISSA", "987.654.321-00", 55678, 2000.0, 1000.0);  
		    System.out.println(contaEsp1.toString()); 
		    boolean debito2 = contaEsp1.debitar(3000.0); 
		    System.out.println("Débito 2: " + debito2); 
		    System.out.println(contaEsp1.toString()); 

		    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		    boolean debito3 = contaEsp1.debitar(2500.0);  
		    System.out.println("Débito 3: " + debito3); 
		    System.out.println(contaEsp1.toString()); 
		  }
}