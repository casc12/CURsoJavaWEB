import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TesteJDBC {
	public static void main(String[] args) throws SQLException{
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21");
		System.out.println("Conectado");
		conexao.close();
		System.out.println("Desconectado");
		
	}

}
