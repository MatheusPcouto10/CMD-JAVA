package comunicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Terminal {

	String pasta;
	String arquivo;
	String textoInserido;
	String arquivoRenomeado;
	String pastaRenomeada;
	String arquivoMovido;

	Scanner sc = new Scanner(System.in);

	public void limparConsole() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("");
		}
	}

	public void criarDiretorio() {
		System.out.println("Digite o nome da pasta: \n");
		pasta = sc.nextLine();
		File file = new File(pasta);
		file.mkdir();
		System.out.println("\n Pasta criada com sucesso! \n");
	}

	public void criarArquivo() throws IOException {
		System.out.printf("Digite o nome do arquivo: \n");
		arquivo = sc.nextLine();

		FileWriter arq = new FileWriter(arquivo);
		System.out.println("\n");
		System.out.println("Insira o texto: \n");
		PrintWriter gravarArq = new PrintWriter(arq);
		textoInserido = sc.nextLine();

		gravarArq.printf(textoInserido);
		System.out.println("\n Arquivo criado com sucesso! \n");
		arq.close();
	}

	public void renomearArquivo() {

		System.out.println("Digite o nome do arquivo que deseja renomear: \n");
		arquivo = sc.nextLine();
		System.out.println("\n Digite o novo nome do arquivo: \n");
		arquivoRenomeado = sc.nextLine();

		new File(arquivo).renameTo(new File(arquivoRenomeado));
		System.out.println("\n Arquivo Renomeado com sucesso! \n");
	}

	public void renomearDiretorio() {

		System.out.println("Digite o nome da pasta que deseja renomear: \n");
		pasta = sc.nextLine();
		System.out.println("\n Digite o novo nome do pasta: \n");
		pastaRenomeada = sc.nextLine();

		new File(pasta).renameTo(new File(pastaRenomeada));
		System.out.println("\n Pasta Renomeado com sucesso! \n");

	}

	public void moverArquivo() {

		System.out.println("Digite o nome do arquivo que deseja mover: \n");
		arquivo = sc.nextLine();
		System.out.println("\n Insira o novo destino do arquivo : \n");
		arquivoMovido = sc.nextLine();

		// Arquivo que será movido
		File moverArquivo = new File(arquivo);

		// Diretorio de destino
		File diretorioDestino = new File(arquivoMovido);

		moverArquivo.renameTo(new File(diretorioDestino, arquivo));
		System.out.println("Arquivo movido para '" + diretorioDestino.getAbsolutePath() + "'" + "\n");

	}

	public void deletarDiretorio() {

		System.out.println("Digite o nome da pasta que deseja deletar: \n");
		pasta = sc.nextLine();

		File pastaDeletada = new File(pasta);
		pastaDeletada.delete();
		System.out.println("\n Pasta deletada com sucesso! \n");
	}

	public void deletarArquivo() {

		System.out.println("Digite o nome do arquivo que deseja deletar: \n");
		arquivo = sc.nextLine();

		File arquivoDeletado = new File(arquivo);
		arquivoDeletado.delete();
		System.out.println("\n Arquivo deletado com sucesso! \n");
	}

	public void executarComando(String comando) {

		ProcessBuilder processBuilder = new ProcessBuilder();
		// Windows
		processBuilder.command("cmd.exe", "/c", comando);

		try {

			Process process = processBuilder.start();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			int exitCode = process.waitFor();
			System.out.println("\nExited with error code : " + exitCode);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
