package comunicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Terminal {

	/* Variáveis */
	String pasta;
	String arquivo;
	String textoInserido;
	String arquivoRenomeado;
	String pastaRenomeada;
	String arquivoMovido;
	String diretorioAcessado;

	ProcessBuilder processBuilder = new ProcessBuilder();
	Scanner sc = new Scanner(System.in);

	public void limparConsole() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("");
		}
	}

	public void listarArquivos() {
		System.out.println("Cole aqui o caminho do diretório para mostrar seus arquivos: \n");
		diretorioAcessado = sc.nextLine();

		File file = new File(diretorioAcessado);
		File[] arquivos = file.listFiles(); // vetor para armazenar os arquivos do diretorio

		for (File fileTmp : arquivos) {
			System.out.println("\n" + fileTmp.getName());
		}
	}

	public void acessarDiretorio() throws IOException {

		System.out.println("Cole aqui o caminho do diretório que deseja acessar: \n");
		diretorioAcessado = sc.nextLine();

		java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																			// caminho inserido

	}

	public void criarDiretorio() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome da pasta: \n"); // Nome da pasta que será criada
			pasta = sc.nextLine();

			// Criando a pasta
			File file = new File(diretorioAcessado, pasta);
			file.mkdir();
			System.out.println("\nPasta criada com sucesso! \n");

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");

	}

	public void criarArquivo() throws IOException {

		if (diretorioAcessado != null) {
			System.out.printf("Digite o nome do arquivo: \n");// Nome do arquivo que será criado
			arquivo = sc.nextLine();

			// Criando o arquivo
			File file = new File(diretorioAcessado, arquivo);
			file.createNewFile();

			// Inserindo o texto dentro do arquivo
			System.out.println("\n");
			System.out.println("Insira o texto: \n");
			PrintWriter gravarArq = new PrintWriter(file);
			textoInserido = sc.nextLine();

			gravarArq.printf(textoInserido);

			System.out.println("\nArquivo criado com sucesso! \n");
			gravarArq.close();

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");

	}

	public void renomearArquivo() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome do arquivo que deseja renomear: \n");// Arquivo a ser renomeado
			arquivo = sc.nextLine();
			System.out.println("\nDigite o novo nome do arquivo: \n");// Novo nome que será atribuido ao arquivo
			arquivoRenomeado = sc.nextLine();

			// Renomeando o arquivo
			new File(diretorioAcessado, arquivo).renameTo(new File(diretorioAcessado, arquivoRenomeado));
			System.out.println("\nArquivo Renomeado com sucesso! \n");

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");
	}

	public void renomearDiretorio() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome da pasta que deseja renomear: \n");// Pasta a ser renomeada
			pasta = sc.nextLine();
			System.out.println("\nDigite o novo nome do pasta: \n");// Novo nome que será atribuido a pasta
			pastaRenomeada = sc.nextLine();

			// Renomeando a pasta
			new File(diretorioAcessado, pasta).renameTo(new File(diretorioAcessado, pastaRenomeada));
			System.out.println("\nPasta Renomeado com sucesso! \n");

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");

	}

	public void moverArquivo() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome do arquivo que deseja mover: \n");// Arquivo a ser movido
			arquivo = sc.nextLine();
			System.out.println("\nCole aqui o destino do arquivo : \n");// Caminho para onde o arquivo deverá ir
			arquivoMovido = sc.nextLine();

			// Arquivo que será movido
			File moverArquivo = new File(diretorioAcessado, arquivo);

			// Diretorio de destino
			File diretorioDestino = new File(arquivoMovido);

			// Movendo o Arquivo para o diretório de Destino
			moverArquivo.renameTo(new File(diretorioDestino, arquivo));
			System.out.println("\nArquivo movido para '" + diretorioDestino.getAbsolutePath() + "'" + "\n");

			java.awt.Desktop.getDesktop().open(new File(diretorioDestino.getAbsolutePath())); // abre no explorer a
																								// pasta de
																								// acordo com o caminho
																								// inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");

	}

	public void deletarDiretorio() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome da pasta que deseja deletar: \n");
			pasta = sc.nextLine();

			File pastaDeletada = new File(diretorioAcessado, pasta);
			pastaDeletada.delete();
			System.out.println("\nPasta deletada com sucesso! \n");

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido
		} else
			System.out.println("Por favor informe um diretório para começar! \n");
	}

	public void deletarArquivo() throws IOException {

		if (diretorioAcessado != null) {
			System.out.println("Digite o nome do arquivo que deseja deletar: \n");
			arquivo = sc.nextLine();

			File arquivoDeletado = new File(diretorioAcessado, arquivo);
			arquivoDeletado.delete();
			System.out.println("\nArquivo deletado com sucesso! \n");

			java.awt.Desktop.getDesktop().open(new File(diretorioAcessado)); // abre no explorer a pasta de acordo com o
																				// caminho inserido

		} else
			System.out.println("Por favor informe um diretório para começar! \n");
	}

	public void executarComando(String comando) {

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