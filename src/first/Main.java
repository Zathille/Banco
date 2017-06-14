package first;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Conta aecio = new Conta(1000,"Neves",10904);
	Conta cx2 = new Conta(200000,"Aecio",12345);
	aecio.creditar(500);
	cx2.debitar(500);
	cx2.creditar(1000);
	aecio.save("C:/Users/Zath/workspace/Banco");
	cx2.save("C:/Users/Zath/workspace/Banco");
	
		
	}

	public static void escreveArquivo() {
		String end = "C:/Users/Zath/workspace/Banco/Teste.txt";
		
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

	public static void lerArquivo(){
		
		String end = "C:/Users/Zath/workspace/Banco/Teste.txt";
		
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
