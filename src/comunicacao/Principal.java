package comunicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Terminal terminal = new Terminal();

		boolean ativo = true;

		while (ativo == true) {
			// MENU PRINCIPAL
			Scanner sc = new Scanner(System.in);
			System.out.println("======== CMD JAVA ========");
			System.out.println("ESCOLHA O COMANDO: ");
			System.out.println("(1) - LISTAR TODOS OS DIRETÓRIOS");
			System.out.println("(2) - MOSTRAR A VERSÃO ATUAL DO WINDOWS");
			System.out.println("(3) - MOSTRAR A DATA ATUAL");
			System.out.println("(4) - MOSTRAR A HORA ATUAL");
			System.out.println("(5) - CRIAR UMA PASTA/DIRETÓRIO");
			System.out.println("(6) - INSERIR TEXTO EM UM NOVO ARQUIVO");
			System.out.println("(7) - RENOMEAR ARQUIVO");
			System.out.println("(8) - RENOMEAR PASTA/DIRETÓRIO");
			System.out.println("(9) - MOVER ARQUIVO PARA UM NOVO DIRETÓRIO");
			System.out.println("(10) - DELETAR PASTA/DIRETÓRIO");
			System.out.println("(11) - DELETAR ARQUIVO");
			System.out.println("(12) - LIMPAR CONSOLE");
			System.out.println("(13) - SAIR DO CMD");

			int i = sc.nextInt();
			sc.nextLine();
			switch (i) {
			case 1:
				terminal.executarComando("dir");
				System.out.println("\n");
				break;

			case 2:
				terminal.executarComando("ver");
				break;
			case 3:
				terminal.executarComando("date /t");
				break;
			case 4:
				terminal.executarComando("time /t");
				break;
			case 5:
				terminal.executarComando("mkdir pasta1");
				break;
			case 6:
				terminal.executarComando("echo 'NOVO ARQUIVO ADICIONADO' > teste1.txt");
				break;
			case 7:
				terminal.executarComando("rename teste1.txt teste15.txt");
				break;
			case 8:
				terminal.executarComando("rename pasta1 pasta15");
				break;
			case 9:
				terminal.executarComando(
						"move teste15.txt \"C:\\Users\\mathe\\OneDrive\\Documentos\\UNITINS\\SISTEMAS OPERACIONAIS\" ");
				break;
			case 10:
				terminal.executarComando("rmdir pasta1");
				break;
			case 11:
				terminal.executarComando("del teste1.txt");
				break;
			case 12:
				terminal.limparConsole();
				break;
			case 13:
				ativo = false;
			default:
				break;

			}

		}

	}

}
