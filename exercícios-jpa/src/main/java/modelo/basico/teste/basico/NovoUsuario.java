package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); 
	EntityManager em = emf.createEntityManager() ;

	Usuario novoUsuario = new Usuario("Luiz Eduardo", "LuizE@gamil.com.br");
	
	em.getTransaction().begin();
	em.persist(novoUsuario);
	em.getTransaction().commit();
	
	
	
	em.close();
	emf.close();
	
	}
}