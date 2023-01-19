package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); 
		EntityManager em = emf.createEntityManager() ;
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setEmail("luizhenrique@gmail.com");
		usuario.setNome("Luiz Henrique Almeida");
		
//		em.merge(usuario);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}
}