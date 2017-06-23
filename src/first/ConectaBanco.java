package first;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectaBanco {
	private Connection connection = null;// conexao
	private Statement statement = null;// consulta
	private ResultSet resultset = null;// retorno
	
	public void conectar(){
		String servidor = "jdbc:mysql://186.202.152.191/agendaaula?autoReconnect=true&useSSL=false";
		String usuario = "agendaaula";
		String senha = "A123456";// palavra chave alterada para 1234 no
									// locawebA123456
		String driver = "com.mysql.jdbc.Driver";
		
		try{
		
		Class.forName(driver);
		this.connection = DriverManager.getConnection(servidor, usuario, senha);
		this.statement = this.connection.createStatement();

	} catch (Exception e) {
		System.out.println("Erro: " + e.getMessage());
	}

	}
	
	public void estaConectado(){
		if(this.connection != null){
			System.out.println("Conectado");
		}else{
			System.out.println("Nao Conectado");
		}
	}
	public void insereUsuario(String nome, String end, int CPF, int conta){
		String query = "INSERT INTO usuarios (nome,end,CPF,conta) VALUES('" + nome + "','" + end + "','" + CPF + "','" + conta + "')";
		try{
			this.statement.executeUpdate(query);
			System.out.println("Usuario inserido.");
			System.out.println( "nome: " + nome + " endereco: " + end +" CPF: "+ CPF + " Conta: " + conta);
		}
		catch(Exception e){
			System.out.println("Erro ao inserir usuario" + e);
		}
		
	}
	
	public void removeUsuario(int CPF){
		String query = "DELETE FROM usuarios where CPF = '" + CPF +"'";
		try{
			this.statement.executeUpdate(query);
			System.out.println("Usuario removido.");
			System.out.println("CPF: "+ CPF);
		}
		catch(Exception e){
			System.out.println("Erro ao inserir usuario" + e);
		}
		
	}
	public void listar(){
		String query = "SELECT * FROM usuarios ORDER BY CPF";
		try{
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				System.out.println("Nome: "+resultset.getString("nome")+" CPF: "+resultset.getString("CPF")+" end: "+resultset.getString("end")+" conta: "+resultset.getString("conta"));
			}
		}
		catch(Exception e){
			System.out.println("Erro ao listar usuarios" + e);
		}

	}
	public void desconectar(){
		try {
			connection.close();
			System.out.println("desconectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
