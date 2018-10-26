public class TesteEmpregado {

	public static void main(String[] args) {
		EmpregadoBaseMaisComissao empregado = new EmpregadoBaseMaisComissao("Fulano", "Silva", "076.784.059-36",
				10000, .06, 1800.00);

		System.out.println("Informação do empregado obtida por métodos get: ");
		System.out.printf("%s %s\n", "Nome é", empregado.getNome());
		System.out.printf("%s %s\n", "Sobrenome é", empregado.getSobrenome());
		System.out.printf("%s %s\n", "CPF é", empregado.getCpf());
		System.out.printf("%s %s\n", "Vendas brutas é", empregado.getVendasBrutas());
		System.out.printf("%s %s\n", "Taxa de comissão é", empregado.getTaxaDeComissao());
		System.out.printf("%s %s\n", "Salario Base é", empregado.getsalarioBase());

		empregado.setVendasBrutas(500);
		empregado.setTaxaDeComissao(.1);
		empregado.setsalarioBase(1800.00);

		System.out.printf("\n%s:\n\n%s\n", "Informação atualizada obtida via toString", empregado);

	}
}
