package first;

public class Usuario {
	String nome;
	int CPF;
	String address;
	Conta conta;
	
	public Usuario(String nome, int CPF, Conta conta){
		this.nome = nome;
		this.CPF = CPF;
		this.conta = conta;
	}
	
	

	public Usuario(String nome, int CPF, String address, Conta conta) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.address = address;
		this.conta = conta;
	}



	public void saque (double valor){
		conta.debitar(valor);
	}
	
	public void deposito (double valor){
		conta.creditar(valor);
	}
	
	public void transferencia (double valor,Conta contaDestino){
		int retorno = conta.debitar(valor);
		if(retorno == 1){
		contaDestino.creditar(valor);
		}
	}
}
