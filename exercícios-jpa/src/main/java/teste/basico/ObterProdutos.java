package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		@SuppressWarnings("unchecked")
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " 
					+ produto.getNome() + ", Preço: " + produto.getPreco());
			
		}	
			
		
		double precoTotal = produtos
					.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (t, p) -> t + p)
					.doubleValue();
			System.out.println("O valor total é: " + String.format("%.2f", precoTotal));
	}

}
