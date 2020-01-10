package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private boolean isUsado;

		
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	private void videoGame() {

	}

	private void videoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {

	}
	
	String usado;
	
	public double calculaImposto() {
		double imposto;
		
		
		if (isUsado == false){
			imposto = getPreco() * 0.45;
			usado = "novo";
			System.out.println("Imposto " + getNome() + " " + modelo+ " " + usado + " " + "R$:" + imposto);
			return 0;			
		}else {
			imposto = getPreco() * 0.25;
			usado = "usado";
			System.out.println("Imposto " + getNome() + " " + modelo + " " + usado + " " + "R$:" + imposto);
			return imposto;			
		}
		
	}

}
