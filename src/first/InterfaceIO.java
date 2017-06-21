package first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InterfaceIO {
	public String end = "C:/Users/Zath/workspace/Banco/Teste.txt";

	public InterfaceIO(String end){
	this.end = end;
	}


	public void escreveArquivo() {
		
		try{
			FileWriter file = new FileWriter(end);
			BufferedWriter objEscrita = new BufferedWriter(file);
			//PrintWriter escreve = new PrintWriter(file);
			//escreve.print("Escrevi no arquivo");
			
			objEscrita.write("I suppose this means the test was successful.");
			objEscrita.newLine();
			objEscrita.write("And I suppose this means I can write multiple lines too.");
			objEscrita.newLine();
			objEscrita.flush();
			objEscrita.close();
			file.close();
			
			System.out.println("Rodou");
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void lerArquivo(){
		
		try{
			FileReader file = new FileReader(end);
			BufferedReader read = new BufferedReader(file);
			String line = read.readLine();
			while(line!=null){
				System.out.println(line);
				line = read.readLine();
				}
			read.close();
			file.close();
			}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
	}
	
}
