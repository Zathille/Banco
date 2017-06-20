package first;

public class ContaIlimitada extends Conta {

	public ContaIlimitada(double saldo, String nome, int numero) {
		super(saldo, nome, numero);
		// TODO Auto-generated constructor stub
	}

public int debitar(double valor){
	saldo = saldo - valor;
	return 1;
}


}
