package model;

import java.util.List;


public class Jogador {

	private long id;
	private String nome;
	private List<Rodada> rodadasGanhas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Rodada> getRodadasGanhas() {
		return rodadasGanhas;
	}
	public void setRodadasGanhas(List<Rodada> rodadasGanhas) {
		this.rodadasGanhas = rodadasGanhas;
	}
	
	
}
