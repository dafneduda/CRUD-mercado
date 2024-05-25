package mercado.controller;

import java.util.ArrayList;

import mercado.model.Produto;
import mercado.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	// criar a ArrayList para armazenar os produtos com seus atributos
	// int numero armazenará o número da última conta que foi criada.
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void criarProduto(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarProdutoPorId(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarProduto(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarProduto(int numero) {
		// TODO Auto-generated method stub

	}
}
