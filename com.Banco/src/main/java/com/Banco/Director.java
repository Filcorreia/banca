package com.Banco;

public class Director extends Funcionario{

	public Director(String nome, int tel, String cargo) {
		super(nome, tel, cargo);
		// TODO Auto-generated constructor stub
	}
	private String cargo;
	private String nome;

	public void post_name(String nome) {
		// TODO Auto-generated method stub
		this.nome=nome;
	}
	public String get_name() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	public void cargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo=cargo;
	}
	public String get_cargo() {
		// TODO Auto-generated method stub
		return this.cargo;
	}



}
