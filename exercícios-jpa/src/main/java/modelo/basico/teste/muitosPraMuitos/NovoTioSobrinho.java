package modelo.basico.teste.muitosPraMuitos;

import infra.DAO;
import muitoPraMuitos.Sobrinho;
import muitoPraMuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Dan");
		Tio tio2 = new Tio("Tio Rone");
		
		Sobrinho sobrinho1 = new Sobrinho("Luiz");
		Sobrinho sobrinho2 = new Sobrinho("Henrique");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
			dao.abrirT()
			.incluir(tio1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharT()
			.fecharT();
	}
}
