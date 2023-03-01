import java.util.ArrayList;
	import java.util.List;
public class Main {
	    public static void main(String[] args) {
	  
	        Chefe chefe = new Chefe("João Bolão", 1, 5000.0, 20.0, 500.0);
	        Comissionado comissionado = new Comissionado("Mariah", 2, 2000.0, 10.0);
	        Horista horista = new Horista("Pedro", 3, 80, 50.0);
	        Empreiteiro empreiteiro = new Empreiteiro("José", 4, 10000.0);


	        List<Funcionario> funcionarios = new ArrayList<>();
	        funcionarios.add(chefe);
	        funcionarios.add(comissionado);
	        funcionarios.add(horista);
	        funcionarios.add(empreiteiro);

	        for (Funcionario funcionario : funcionarios) {
	            System.out.println("Recibo de Pagamento:");
	            System.out.println("-----------------------------------------------------");
	            System.out.println("Nome: " + funcionario.getNome());
	            System.out.println("Número de Registro: " + funcionario.getNumeroRegistro());
	            System.out.println("Salário: R$ " + funcionario.calcularSalario());
	            System.out.println();
	        }
	    }
	}