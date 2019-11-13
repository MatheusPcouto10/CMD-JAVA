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
			System.out.println("(1) - LISTAR TODOS OS DIRET�RIOS");
			System.out.println("(2) - MOSTRAR A VERS�O ATUAL DO WINDOWS");
			System.out.println("(3) - MOSTRAR A VERS�O ATUAL DO JAVA");
			System.out.println("(4) - MOSTRAR AS PROPRIEDADES DE CONEX�O");
			System.out.println("(5) - MOSTRAR A DATA ATUAL");
			System.out.println("(6) - MOSTRAR A HORA ATUAL");
			System.out.println("(7) - CRIAR UMA PASTA/DIRET�RIO");
			System.out.println("(8) - CRIAR E INSERIR TEXTO EM UM ARQUIVO");
			System.out.println("(9) - RENOMEAR ARQUIVO");
			System.out.println("(10) - RENOMEAR PASTA/DIRET�RIO");
			System.out.println("(11) - MOVER ARQUIVO PARA UM NOVO DIRET�RIO");
			System.out.println("(12) - DELETAR PASTA/DIRET�RIO");
			System.out.println("(13) - DELETAR ARQUIVO");
			System.out.println("(14) - LIMPAR CONSOLE");
			System.out.println("(15) - SAIR DO CMD");

			int i = sc.nextInt();
			sc.nextLine();
			switch (i) {
			case 1:
				terminal.executarComando("dir");
				System.out.println("\n");
				break;
			case 2:
				terminal.executarComando("ver");
				System.out.println("\n");
				break;
			case 3:
				terminal.executarComando("java --version");
				System.out.println("\n");
				break;
			case 4:
				terminal.executarComando("ipconfig");
				System.out.println("\n");
				break;
			case 5:
				terminal.executarComando("date /t");
				System.out.println("\n");
				break;
			case 6:
				terminal.executarComando("time /t");
				System.out.println("\n");
				break;
			case 7:
				terminal.criarDiretorio();
				break;
			case 8:
				terminal.criarArquivo();
				break;
			case 9:
				terminal.renomearArquivo();
				break;
			case 10:
				terminal.renomearDiretorio();
				break;
			case 11:
				terminal.moverArquivo();
				break;
			case 12:
				terminal.deletarDiretorio();
				break;
			case 13:
				terminal.deletarArquivo();
				break;
			case 14:
				terminal.limparConsole();
				break;
			case 15:
				ativo = false;
			default:
				break;

			}

		}

	}

}