package com.Banco;

public class ContaCorrente implements Conta{
	private double saldo;
	private double taxaOperacao = 0.45;
	
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor -taxaOperacao;
	}

	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -=valor -taxaOperacao;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
	    return this.saldo;
	}

}
