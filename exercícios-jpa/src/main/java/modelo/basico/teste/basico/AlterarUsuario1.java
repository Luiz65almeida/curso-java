package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Produto;

public class AlterarUsuario1 {
	
	
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); 
	EntityManager em = emf.createEntityManager() ;
	
	em.getTransaction().begin();
	
	Produto produto = em.find(Produto.class, 4L);
	em.detach(produto);
	produto.setNome("TV LED LG 50 Polegadas 4K");
	
	em.merge(produto);
	
	
	em.getTransaction().commit();
	
	em.close();
	emf.close();
	}
}