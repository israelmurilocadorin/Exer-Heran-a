public class EmpregadoComissao extends Empregado {
	
	protected double vendasBrutas;
	protected double taxaDeComissao;
	
	public EmpregadoComissao(String nome, String sobrenome, String cpf, double vendasBrutas, double taxaDeComissao) {
		super();
		this.vendasBrutas = vendasBrutas;
		this.taxaDeComissao = taxaDeComissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = taxaDeComissao;
	}
	public String toString() {
        return String.format("%s: %.2f\n%s: %.2f", 
        	"Comissionado"
            "Vendas Brutas", vendasBrutas,
            "Taxa de Comissão", taxaDeComissao);
    }
            
		
}
