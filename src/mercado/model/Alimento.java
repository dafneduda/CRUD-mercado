package mercado.model;

public class Alimento extends Produto {

	private String marca;

	public Alimento(int id, String nome, int tipo, float preco, String marca) {
		super(id, nome, tipo, preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.marca);
	}
}