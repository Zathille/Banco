package first;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Conta {
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

	public int debitar (double valor){
		if(valor > saldo){
			//System.out.println("Insufficient Funds in" +  titular + "'s account.");
			return 0;
		}
		else{
		saldo = saldo - valor;
		extrato.add("-" + valor + " New Total = " + saldo);
		//System.out.println(valor + " Zenny withdrawn from " + titular + ".");
		//System.out.println(saldo + " Zenny remaining in " + titular + "'s account.");
		return 1;
		}
	}
	public void creditar (double valor){
		saldo = saldo + valor;
		extrato.add("+" + valor + " New Total = " + saldo);
		//System.out.println(valor + " Zenny deposited in " + titular + "'s account");
		//System.out.println(saldo + " Zenny in total in "  + titular + "'s account");
	}
	
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