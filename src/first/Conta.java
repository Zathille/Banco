package first;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public abstract class Conta {
	double saldo;
	String titular;
	int num;
	ArrayList<String> extrato;
	
	//Construtor de classe
	
	
	public Conta (double saldo, String nome, int numero){
		this.saldo = saldo;
		this.num = numero;
		this.titular = nome;
		extrato = new ArrayList<String>();
	}
	
	


	public void creditar (double valor){
		saldo = saldo + valor;
		extrato.add("+" + valor + " New Total = " + saldo);
		//System.out.println(valor + " Zenny deposited in " + titular + "'s account");
		//System.out.println(saldo + " Zenny in total in "  + titular + "'s account");
	}
	public abstract int debitar(double valor);
	
	public void imprimeExtrato(){
		for(int cont = 0; cont<extrato.size();cont++){
			System.out.println(extrato.get(cont));
		}
		System.out.println("Saldo Atual: "+ saldo);
	}
	
	public void save(String path){
		String end = path + "/Account_" + num + ".txt";
		try{
			FileWriter file = new FileWriter(end);
			BufferedWriter write = new BufferedWriter(file);
			write.write(String.valueOf(saldo));
			write.newLine();
			write.write(titular);
			write.newLine();
			write.write(String.valueOf(num));
			write.newLine();
			write.write(extrato.toString());
			write.newLine();
			write.close();
			file.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}