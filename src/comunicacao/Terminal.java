package comunicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {
	
public void limparConsole() {
	for (int i = 0; i < 1000; i++) {
		System.out.println("");
	}
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
