package model;
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Correntista correntista) {
		super(correntista);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupan�a");
		
		super.imprimirCommonInfo();
		
	}
}
