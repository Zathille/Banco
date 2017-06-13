package first;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
				
		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("Input Username, input quit to end");
		String username = scan.nextLine();
		while (!username.equals("quit")){
			lista.add(username);
			System.out.println("Input more Usernames, input quit to end");
			username = scan.nextLine();
		}
		System.out.println(lista);
		
		

		
		/*
		// TODO Auto-generated method stub
		Conta objconta = new Conta(200,"Brian",34666);
		/*objconta.num = 21011994;
		objconta.saldo = 500.0;
		objconta.creditar(20);
		objconta.debitar(1000);*/
		/*
		Conta godzilla = new Conta(2000,"Gojira",19950);
		/*godzilla.saldo = 20.0;
		godzilla.titular = "Gojira";
		godzilla.debitar(10);*/
		/*
		Usuario Brian = new Usuario("Brian",123456789,objconta);
		
		Brian.transferencia(100, godzilla);
		*/
	}

}
