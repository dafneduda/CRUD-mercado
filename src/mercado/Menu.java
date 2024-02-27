package mercado;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import mercado.controller.ProdutoController;
import mercado.model.Alimento;
import mercado.model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		// Teste da Classe Produto (excluido após inserir ABSTRACT)
		// Produto a1 = new Produto(123, "feijão", 1, 30.0f);
		// a1.visualizar();

		// Teste da Classe Alimento
		Alimento a2 = new Alimento(124, "arroz", 1, 30.0f, "pantera");
		a2.visualizar();

		int opcao;

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

				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Consultar Produtos - por ID\n\n");

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				keyPress();
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");

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
