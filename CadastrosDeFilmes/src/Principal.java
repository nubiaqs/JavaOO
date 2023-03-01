import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	private static final String NOME_ARQUIVO = "acervo.csv";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nSistema de Cadastro de Filmes\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar novo filme");
            System.out.println("2 - Ler/exibir todo o acervo");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    exibirAcervo();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void cadastrarFilme() {
        System.out.println("\nCadastrar novo filme\n");
        System.out.println("Digite o nome do filme:");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano do filme:");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o gênero do filme:");
        String genero = scanner.nextLine();

        System.out.println("Digite a duração do filme em minutos:");
        int duracao = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite a classificação do Filme - (de 1 a 5):");
        int classificacao = scanner.nextInt();
        scanner.nextLine(); 

        Filme filme = new Filme(nome, ano, genero, duracao, classificacao);
        Escritor escritor = new Escritor();
		escritor.gravarFilme(NOME_ARQUIVO, filme);
    }

    private static void exibirAcervo() {
        System.out.println("\nAcervo de Filmes\n");
        ArrayList<Filme> acervo = Leitor.lerAcervo(NOME_ARQUIVO);
        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio.");
        } else {
            for (Filme filme : acervo) {
                System.out.println(filme.toString());
            }
        }
    }
}

