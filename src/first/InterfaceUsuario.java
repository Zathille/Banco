package first;

import java.util.Scanner;
import java.util.ArrayList;

public class InterfaceUsuario {
	Scanner scan = new Scanner(System.in);
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	int numeroConta = 0;
	
	public void menuprincipal(){
		System.out.println("Menu Inicial");
		System.out.println("Digite uma opcao abaixo");
		System.out.println("Digite 1 para Registrar um usuario novo");
		System.out.println("Digite 2 para Acessar usuario");
		System.out.println("Digite 3 para sair");
		int opcao = 0;
		while(opcao != 3){
		opcao = Integer.valueOf(scan.nextLine());
		if(opcao == 1){
			System.out.println("Registro de Usuario");
			menuregusuario();
		}
		else if(opcao == 2){
			System.out.println("OP 2 teste");
			menuaccessusuario();
		}
		else if(opcao == 3){
			System.out.println("tchau");
		}
		else{
			System.out.println("input invalido");
			}
		}
		}
	public void menuregusuario(){
		System.out.println("Inserir nome de usuario");
		String nome = scan.nextLine();
		System.out.println("Inserir CPF de usuario");
		int CPF = Integer.valueOf(scan.nextLine());
		Conta conta = menucriaconta(nome);
		Usuario novousuario = new Usuario(nome,CPF,conta);
		usuarios.add(novousuario);
		System.out.println(usuarios);
		
		
	}
	
	public void menuaccessusuario(){
		
	}

	public Conta menucriaconta(String nome){
		System.out.println("---Criando Conta---");
		System.out.println("Qual tipo da conta a criar?");
		System.out.println("1 - Conta Debito");
		System.out.println("2 - Conta Ilimitada");
		System.out.println("3 - Cheque Especial");
		int tipo = Integer.valueOf(scan.nextLine());
		while(!(tipo == 1 || tipo == 2 || tipo == 3)){
			System.out.println("Tipo Invalido, digite 1, 2 ou 3");
			tipo = Integer.valueOf(scan.nextLine());
		}
		System.out.println("Digite saldo Inicial");
		int saldo= Integer.valueOf(scan.nextLine());
		Conta conta;
		switch (tipo){
		case 1:
			conta = new ContaDebito(saldo,nome,numeroConta);
			break;
		case 2:
			conta = new ContaIlimitada(saldo,nome,numeroConta);
			break;
		case 3:
			conta = new ContaChequeEspecial(saldo,nome,numeroConta,500);
			break;
		default:
			conta = new ContaDebito(saldo,nome,numeroConta);
		
		
		}
		numeroConta ++;
		System.out.println("Conta criada com Sucesso!");
		return conta;
	}
}
	
