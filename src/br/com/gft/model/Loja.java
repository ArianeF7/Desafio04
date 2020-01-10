package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void loja() {

	}

	public void loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {

	}

	public void listaLivros() {

		if (livros.size() == 0) {
			System.out.println("A loja n�o tem livros em seu estoque");
		} else {
			System.out.println("A loja Americanas possui estes livros para venda:");
			for (int cont = 0; cont < livros.size(); cont++) {

				System.out.println("Titulo: " + livros.get(cont).getNome() + ", pre�o: " + livros.get(cont).getPreco()
						+ ", quantidade: " + livros.get(cont).getQtd() + " em estoque");
			}
		}

	}

	public void listaVideoGame() {
		if(videoGames.size() == 0) {
			System.out.println("A loja n�o tem video-games no seu estoque");
		}else {
			System.out.println("A loja Americanas possui estes video-games para venda:");
			for(int cont2 = 0; cont2 < videoGames.size(); cont2++){
				System.out.println("Video-game: " + videoGames.get(cont2).getModelo() + ", pre�o: " + videoGames.get(cont2).getPreco() +
						", quantidade: " + videoGames.get(cont2).getQtd() + "em estoque");
			}
		}

	}

	public double calculaPatrimonio() {
		double patrimonio =0;
		for (Livro livro : livros) {
			
			patrimonio += livro.getPreco() * livro.getQtd();
		}
		
		for (VideoGame Game : videoGames) {
			
			patrimonio += Game.getPreco() * Game.getQtd();			
			
		}
		System.out.println("O patrimonio da loja: Americanas � de R$: " + patrimonio);
		
		return patrimonio;
	}

}
