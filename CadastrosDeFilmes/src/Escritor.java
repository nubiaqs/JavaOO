import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
	public void gravarFilme(String nomeArquivo, Filme filme) {
		try {
			File f = new File(nomeArquivo);
			FileWriter fw = new FileWriter(nomeArquivo, true);
			PrintWriter pw = new PrintWriter(fw);
			BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true));
			bw.write(filme.toCSV());
			bw.newLine();
			bw.close();
			System.out.println("Filme gravado com sucesso.");
			pw.close();
			bw.close();
		} catch (IOException ex) {
			System.out.println("Erro ao gravar o filme.");
			ex.printStackTrace();
			
		}	
	}
}
