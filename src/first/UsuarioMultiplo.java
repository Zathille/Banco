package first;

import java.util.ArrayList;

public class UsuarioMultiplo extends Usuario {
	
	ArrayList<Conta> contas;

	public UsuarioMultiplo(String nome, int CPF, Conta conta) {
		super(nome, CPF, conta);
		contas = new  ArrayList<Conta>();
		contas.add(conta);
		// TODO Auto-generated constructor stub
	}
	
	public void addConta(Conta conta){
		contas.add(conta);
	}
	public void saque (double valor, int i){
		conta = contas.get(i);
		conta.debitar(valor);
	}
	
	public void deposito (double valor, int i){
		conta = contas.get(i);
		conta.creditar(valor);
	}
	
	public void transferencia (double valor,Conta contaDestino, int i){
		conta = contas.get(i);
		int retorno = conta.debitar(valor);
		if(retorno == 1){
		contaDestino.creditar(valor);
		}
	}
}
