import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static void main(String[] args) {
		try {
			// vou precisar manipular o arquivo
			File f = new File("dados3.txt");
			FileReader = fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linha;
			do {
				linha = br.readLine();
				if (linha != null) {
					String infos[] = linha.split(";");
					int id = Integer.parseInt(Infos[0]);
					String nome = infos[1];
					double preco = Double.parseDoble(infos[2]);
					Produto p = new Produto(id, nome, preco);
					System.out.println("");
				}
			}while (linha != null);
			br.close();
			fr.close();
		}catch (IOException e) {
			
		}
	}
}




