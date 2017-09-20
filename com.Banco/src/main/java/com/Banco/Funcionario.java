package com.Banco;

abstract class Funcionario implements info_func{
	private String nome;
	private int tel;
	
	
	
	public Funcionario(String nome, int tel, String cargo) {
		super();
		this.nome = nome;
		this.tel = tel;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	private String cargo;
	
	
}
