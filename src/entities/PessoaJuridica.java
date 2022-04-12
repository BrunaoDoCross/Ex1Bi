package entities;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, Double renda, String cnpj) {
		super(nome, renda);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public Double getir() {
		return super.getRenda() + super.getRenda()*0.1;
	}
	
	@Override
	public String toString() {
		return ("\nNome (Empresa): " 
				+ super.getNome() 
				+ "\nCNPJ: " 
				+ cnpj
				+ "\nImposto de Renda: "
				+ getir());
	}
	
}
