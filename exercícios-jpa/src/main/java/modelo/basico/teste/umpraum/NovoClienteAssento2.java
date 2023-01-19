package modelo.basico.teste.umpraum;

import infra.DAO;
import umPraUm2.Assento;
import umPraUm2.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		
		Assento assento = new Assento("7C");
		Cliente cliente = new Cliente ("Thamirez", assento);
		
//		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
//		dao.incluirAtomico(cliente);
	}

}
