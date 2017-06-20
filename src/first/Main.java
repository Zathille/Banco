package first;

//import java.util.ArrayList;
import java.io.*;
//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ContaIlimitada contailimitada = new ContaIlimitada(20,"Nome", 123456);
		contailimitada.imprimeExtrato();
		contailimitada.debitar(50);
		contailimitada.imprimeExtrato();
		ContaChequeEspecial contacheque = new ContaChequeEspecial(3000,"Atum",123457,500);
		contacheque.debitar(5000);
		contacheque.imprimeExtrato();
		ContaDebito contadebito = new ContaDebito(2000,"Boi",123458);
		contadebito.debitar(2001);
		contadebito.imprimeExtrato();
		UsuarioMultiplo user =  new UsuarioMultiplo("Eu",234832908,contailimitada);
		user.addConta(contacheque);
		user.addConta(contadebito);
		user.transferencia(10, contacheque, 0);
		contacheque.imprimeExtrato();
		
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
