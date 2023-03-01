
public class DadoFuncionario {

	public class TesteFuncionario {
		public static void main(String[] args) {
			Funcionario f1 = new Funcionario("Nubia", "Analista", 3500.00);
			System.out.println(f1.imprimir());
			f1.aumentarSalario(10);

			System.out.println("Novo salario R$" + String.format("%.2f", f1.getSalario()));
		}

	}

}
