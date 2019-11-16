package comunicacao;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		Terminal terminal = new Terminal();

		boolean ativo = true;

		while (ativo == true) {

			// MENU PRINCIPAL
			Scanner sc = new Scanner(System.in);
			System.out.println("======== CMD JAVA ========");
			System.out.println("ESCOLHA O COMANDO: ");
			System.out.println("(1) - LISTAR TODOS OS ARQUIVOS DE UM DIRETÓRIO");
			System.out.println("(2) - ACESSAR UM DIRETÓRIO");
			System.out.println("(3) - ABRIR UM PROGRAMA");
			System.out.println("(4) - MOSTRAR AS PROPRIEDADES DO WINDOWS");
			System.out.println("(5) - MOSTRAR A VERSÃO ATUAL DO JAVA");
			System.out.println("(6) - MOSTRAR AS PROPRIEDADES DE CONEXÃO");
			System.out.println("(7) - MOSTRAR A DATA ATUAL");
			System.out.println("(8) - MOSTRAR A HORA ATUAL");
			System.out.println("(9) - CRIAR UMA PASTA/DIRETÓRIO");
			System.out.println("(10) - CRIAR E INSERIR TEXTO EM UM ARQUIVO");
			System.out.println("(11) - RENOMEAR ARQUIVO");
			System.out.println("(12) - RENOMEAR PASTA/DIRETÓRIO");
			System.out.println("(13) - MOVER ARQUIVO PARA UM NOVO DIRETÓRIO");
			System.out.println("(14) - DELETAR PASTA/DIRETÓRIO");
			System.out.println("(15) - DELETAR ARQUIVO");
			System.out.println("(16) - LIMPAR CONSOLE");
			System.out.println("(17) - SAIR DO CMD");

			int i = sc.nextInt();
			sc.nextLine();
			switch (i) {
			case 1:
				terminal.listarArquivos();
				System.out.println("\n");
				break;
			case 2:
				terminal.acessarDiretorio();
				System.out.println("\n");
				break;
			case 3:
				System.out.println("[Painel de Controle -> control]");
				System.out.println("[Calculadora -> calc]");
				System.out.println("[Bloco de Notas -> notepad]");
				System.out.println("[Windows Explorer -> explorer]");
				System.out.println("[Spotify -> spotify]");

				terminal.abrirPrograma();
				System.out.println("\n");
				break;
			case 4:
				terminal.executarComando("systeminfo");
				System.out.println("\n");
				break;
			case 5:
				terminal.executarComando("java --version");
				System.out.println("\n");
				break;
			case 6:
				terminal.executarComando("ipconfig");
				System.out.println("\n");
				break;
			case 7:
				terminal.executarComando("date /t");
				System.out.println("\n");
				break;
			case 8:
				terminal.executarComando("time /t");
				System.out.println("\n");
				break;
			case 9:
				terminal.criarDiretorio();
				break;
			case 10:
				terminal.criarArquivo();
				break;
			case 11:
				terminal.renomearArquivo();
				break;
			case 12:
				terminal.renomearDiretorio();
				break;
			case 13:
				terminal.moverArquivo();
				break;
			case 14:
				terminal.deletarDiretorio();
				break;
			case 15:
				terminal.deletarArquivo();
				break;
			case 16:
				terminal.limparConsole();
				break;
			case 17:
				ativo = false;
			default:
				break;

			}

		}

	}

}