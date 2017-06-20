package first;

public class ContaChequeEspecial extends Conta {
	public double limite;

	public ContaChequeEspecial(double saldo, String nome, int numero, double limite) {
		super(saldo, nome, numero);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}
	
	public int debitar(double valor){
		if(valor<(saldo+limite)){
			saldo = saldo - valor;
			return 1;
		}else{
			return 0;
		}
		
	}
	

}
