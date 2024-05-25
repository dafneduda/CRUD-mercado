package mercado.model;

public class Bebida extends Produto {

	private int volume;

	public Bebida(int id, String nome, int tipo, float preco, int volume) {
		super(id, nome, tipo, preco);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Volume: " + this.volume + "ml");
	}
}