package entities;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome, Double ir, String cpf) {
		super(nome, ir);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public Double getir() {
		if (super.getRenda()<=1400) {
			return super.getRenda();
		}
		else if(super.getRenda()>=1400.01 && super.getRenda()<=2100) {
			return super.getRenda() + super.getRenda()*0.10;
		}
		else if(super.getRenda()>=2100.01 && super.getRenda()<=2800) {
			return super.getRenda() + super.getRenda()*0.15;
		}
		else if(super.getRenda()>=2800.01 && super.getRenda()<=3600) {
			return super.getRenda() + super.getRenda()*0.25;
		}
		else {
			return super.getRenda() + super.getRenda()*0.30;
		}
	}
	@Override
	public String toString() {
		return ("\nNome (pessoa): " 
				+ super.getNome() 
				+ "\nCPF: " 
				+ cpf
				+ "\nImposto de Renda: "
				+ getir());
	}
}
