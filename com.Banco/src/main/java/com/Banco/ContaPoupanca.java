package com.Banco;

public class ContaPoupanca implements Conta {
	private double saldo;

	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo +=valor;
	}

	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

}
