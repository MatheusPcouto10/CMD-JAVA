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
			System.out.println("(3) - MOSTRAR A VERSÃO ATUAL DO WINDOWS");
			System.out.println("(4) - MOSTRAR A VERSÃO ATUAL DO JAVA");
			System.out.println("(5) - MOSTRAR AS PROPRIEDADES DE CONEXÃO");
			System.out.println("(6) - MOSTRAR A DATA ATUAL");
			System.out.println("(7) - MOSTRAR A HORA ATUAL");
			System.out.println("(8) - CRIAR UMA PASTA/DIRETÓRIO");
			System.out.println("(9) - CRIAR E INSERIR TEXTO EM UM ARQUIVO");
			System.out.println("(10) - RENOMEAR ARQUIVO");
			System.out.println("(11) - RENOMEAR PASTA/DIRETÓRIO");
			System.out.println("(12) - MOVER ARQUIVO PARA UM NOVO DIRETÓRIO");
			System.out.println("(13) - DELETAR PASTA/DIRETÓRIO");
			System.out.println("(14) - DELETAR ARQUIVO");
			System.out.println("(15) - LIMPAR CONSOLE");
			System.out.println("(16) - SAIR DO CMD");

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
				terminal.executarComando("ver");
				System.out.println("\n");
				break;
			case 4:
				terminal.executarComando("java --version");
				System.out.println("\n");
				break;
			case 5:
				terminal.executarComando("ipconfig");
				System.out.println("\n");
				break;
			case 6:
				terminal.executarComando("date /t");
				System.out.println("\n");
				break;
			case 7:
				terminal.executarComando("time /t");
				System.out.println("\n");
				break;
			case 8:
				terminal.criarDiretorio();
				break;
			case 9:
				terminal.criarArquivo();
				break;
			case 10:
				terminal.renomearArquivo();
				break;
			case 11:
				terminal.renomearDiretorio();
				break;
			case 12:
				terminal.moverArquivo();
				break;
			case 13:
				terminal.deletarDiretorio();
				break;
			case 14:
				terminal.deletarArquivo();
				break;
			case 15:
				terminal.limparConsole();
				break;
			case 16:
				ativo = false;
			default:
				break;

			}

		}

	}

}