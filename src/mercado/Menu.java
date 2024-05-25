package mercado;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import mercado.controller.ProdutoController;
import mercado.model.Alimento;
import mercado.model.Bebida;
import mercado.model.Produto;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, id, tipo, numero, volume;
		String nome, marca;
		float preco;

		// Teste da Classe Produto (excluido após inserir ABSTRACT)
		// Produto a1 = new Produto(123, "feijão", 1, 30.0f);
		// a1.visualizar();

		// Teste da Classe Alimento
		//Alimento a2 = new Alimento(124, "arroz", 1, 30.0f, "pantera");
		//a2.visualizar();

		while (true) {

			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("                   MERCADO DUDA                      ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar Todos os Produtos             ");
			System.out.println("            3 - Consultar Produto por ID             ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("   Opção desejada:                                   ");
			System.out.println("-----------------------------------------------------");

			// add try catch para tratar exceções
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nObrigade, Mercado Duda agradece a preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();
				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				do {
					System.out.println("Digite o Tipo do Produto (1-Alimento ou 2-Bebida): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Preço do Produto R$");
				preco = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a marca: ");
					leia.skip("\\R?");
					marca = leia.nextLine();
					produtos.criarProduto(new Alimento(id, nome, tipo, preco, marca));
				}
				case 2 -> {
					System.out.println("Digite o Volume em ml: ");
					volume = leia.nextInt();
					leia.skip("\\R?");
					produtos.criarProduto(new Bebida(id, nome, tipo, preco, volume));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");
				produtos.listarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println("Consultar Produtos - por ID\n\n");

				System.out.println("Digite o ID do Produto: ");
				numero = leia.nextInt();

				produtos.consultarProdutoPorId(numero);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(id);

				if (buscaProduto != null) {

					tipo = buscaProduto.getTipo();

					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("Digite o Preço do Produto R$");
					preco = leia.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite a marca: ");
						leia.skip("\\R?");
						marca = leia.nextLine();
						produtos.atualizarProduto(new Alimento(id, nome, tipo, preco, marca));

					}
					case 2 -> {
						System.out.println("Digite o Volume em ml: ");
						volume = leia.nextInt();
						leia.skip("\\R?");
						produtos.atualizarProduto(new Bebida(id, nome, tipo, preco, volume));
					}
					default -> {
						System.out.println("Tipo de Produto Inválido!");
					}

					}
				} else {
					System.out.println("O Produto não foi encontrado!");
				}

				keyPress();
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");

				System.out.println("\nDigite o ID do Produto: ");
				numero = leia.nextInt();

				produtos.deletarProduto(numero);

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	private static void keyPress() {
		try {

			System.out.println("\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
