package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good Night"};
		
		String pasta = "C:\\Users\\Gabriel\\ws-eclipse\\EscrevendoEmArquivos\\escrever.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
