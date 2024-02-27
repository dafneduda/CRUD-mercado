package mercado.model;

import java.util.Scanner;

public class Alimento {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

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

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nObrigade, Mercado Duda agradece a preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");

				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");

				break;
			case 3:
				System.out.println("Consultar Produtos - por ID\n\n");

				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				break;
			case 5:
				System.out.println("Deletar Produto\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}
