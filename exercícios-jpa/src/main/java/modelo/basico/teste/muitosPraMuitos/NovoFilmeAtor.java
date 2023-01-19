package modelo.basico.teste.muitosPraMuitos;

import infra.DAO;
import muitoPraMuitos.Ator;
import muitoPraMuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme ("O Lobo de wall Street", 9.9);
		Filme filmeB = new Filme ("A Origem", 10.0);
		
		Ator atorA = new Ator ("Leonardo DiCaprio");
		Ator atrizB = new Ator ("Margot Robbie");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
	}

}
