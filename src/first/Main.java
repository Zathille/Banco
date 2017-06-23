package first;

//import java.util.ArrayList;
//import java.io.*;
//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//InterfaceUsuario Interface = new InterfaceUsuario();
		
		//Interface.menuprincipal();
		ConectaBanco conexao = new ConectaBanco();
		conexao.conectar();
		conexao.estaConectado();
		//conexao.insereUsuario("Eu", "Rua dos tolos 0", 123456, 98765);
		//conexao.removeUsuario(123456);
		conexao.listar();
		conexao.desconectar();
	}
	


}
