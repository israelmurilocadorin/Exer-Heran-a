public class EmpregadoBaseMaisComissao {
	public class EmpregadoBaseMaisComissao extends EmpregadoComissao {

		private double salarioBase;

		public EmpregadoBaseMaisComissao(String nome, String sobrenome, String cpf, double vendasBrutas,
				double taxaDeComissao, double salarioBase) {
			super(nome, sobrenome, cpf, vendasBrutas, taxaDeComissao);
			
			this.salarioBase = salarioBase;
		}

		public double getsalarioBase() {
			return salarioBase;
		}

		public void setsalarioBase(double salarioBase) {
			if (salarioBase >= 0.0)
				this.salarioBase = salarioBase;
			else
				throw new IllegalArgumentException("Salario base deve ser >= 0.0");
		}
		

		public double getSalarioBase() {
			return salarioBase;
		}

		@Override
		public double rendimentos() {
			return super.rendimentos() + getSalarioBase();
		}

		// retorna a representação em String do objeto
		@Override // indica que esse objeto sobrescreve o método da superclasse
		public String toString() {
			return String.format("%s: \n%s: %.2f", 
					super.toString(), 
					"Salario Base", getsalarioBase());
		}
	}

}
