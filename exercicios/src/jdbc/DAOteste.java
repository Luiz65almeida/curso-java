package jdbc;

public class DAOteste {

	public static void main(String[] args) {
		
	
	DAO dao = new DAO();
	
	String sql = "INSERT INTO pessoas (nome) VALUES (?)";
	dao.incluir(sql, "Rone Araujo");
	
	}
}