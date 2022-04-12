package entities;

public abstract class Pessoa {
	private String nome;
	private Double renda;

	public Pessoa(String nome, Double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public abstract Double getir();

	public abstract String toString();


}
