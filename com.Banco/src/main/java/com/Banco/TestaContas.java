package com.Banco;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1220.90);
	//	cc.sacar(50);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(1000);
		
		GeradorExtratos gerador = new GeradorExtratos();
		gerador.geradorConta(cc);
		gerador.geradorConta(cp);
		
		
		Director d = new Director(null, 0, null);
		d.post_name("Filipe");
		d.cargo("Director");
		
		
		Print_info_func info = new Print_info_func();
		info.Print_funcionario(d);
		

		
	}
}
