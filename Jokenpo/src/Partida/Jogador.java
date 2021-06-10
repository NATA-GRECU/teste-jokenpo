package Partida;

public class Jogador {

	private String nome;
	
	private int rodadasGanha;
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRodadasGanha() {
		return rodadasGanha;
	}
	
	public void setRodadasGanha(int rodadasGanha) {
		this.rodadasGanha = rodadasGanha;
	}
	
	
}
