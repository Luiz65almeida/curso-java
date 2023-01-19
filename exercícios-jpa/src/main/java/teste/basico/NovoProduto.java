package teste.basico;

import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Produto produto = new Produto("TV Polegadas 4K", 2699.90);
		
//		DAO <Produto> dao = new DAO<> (Produto.class);
//		dao.abrirT().incluir(produto).fecharT().fechar();
		
		System.out.println("Produto incluído com sucesso !");
		
	}

}
