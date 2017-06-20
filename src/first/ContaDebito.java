package first;

public class ContaDebito extends Conta {

	public ContaDebito(double saldo, String nome, int numero) {
		super(saldo, nome, numero);
		// TODO Auto-generated constructor stub
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

}
