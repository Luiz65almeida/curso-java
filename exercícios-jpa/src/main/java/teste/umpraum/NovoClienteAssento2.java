package teste.umpraum;

import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		
		Assento assento = new Assento("7C");
		Cliente cliente = new Cliente ("Thamirez", assento);
		
//		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
//		dao.incluirAtomico(cliente);
	}

}
