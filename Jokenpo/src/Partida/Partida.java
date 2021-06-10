package Partida;

import java.util.Random;
import java.util.Scanner;

public class Partida {

	
	public void iniciarPartida(Jogador jogador, int numeroDeRodadas) {
		
		Scanner leia = new Scanner(System.in);
		int rodadaGanhaJogador = 0, rodadaGanhaPc = 0;
		
				Random aleatorio = new Random();
				
				int jogadaEscolhida = 0; 
				
				for(int i=1;i <= numeroDeRodadas; i++) {
				int jogadaComputador = aleatorio.nextInt(3) + 1;
				System.out.println("\n--- JOKENPO NTT DATA ---");
				System.out.println("Jogadas: 1-Pedra , 2-Papel , 3-Tesoura");
				
				
				System.out.println("Digite a opção desejada: ");
				jogadaEscolhida = leia.nextInt();
				
				switch(jogadaEscolhida) {
				case 1:
					System.out.println("\nVocê escolheu Pedra!");
					break;
				case 2:
					System.out.println("\nVocê escolheu Papel!");
					break;
				case 3:
					System.out.println("\nVocê escolheu Tesoura!");
					break;
				default:
						System.out.println("Escolha uma opção válida: ");
						break;
				}	

				//Computador
				switch(jogadaComputador) {
				case 1:
					System.out.println("Computador escolheu Pedra!");
					break;
				case 2:
					System.out.println("Computador escolheu Papel!");
					break;
				case 3:
					System.out.println("Computador escolheu Tesoura!");
					break;
				}
				
				if(jogadaEscolhida == jogadaComputador) {
					System.out.println("Empate!");
				}
				else if(jogadaEscolhida == 1 && jogadaComputador == 3 ||
					jogadaEscolhida == 2 && jogadaComputador == 1 || 
					jogadaEscolhida == 3 && jogadaComputador == 2) {
					System.out.println("Parabéns " + jogador.getNome() + " voce ganhou a rodada "+ i + "!");
					rodadaGanhaJogador++;
					jogador.setRodadasGanha(rodadaGanhaJogador);
				
				} else {
					rodadaGanhaPc++;
					System.out.println("O computador ganhou a rodada "+ i +"!");
				}
				
		}
				if(rodadaGanhaJogador == rodadaGanhaPc) {
					System.out.println("A partida empatou");
					System.out.println("RESULTADO: " + "\n" + jogador.getNome() + ": " + rodadaGanhaJogador 
							+ "\nComputador:" + ": " + rodadaGanhaPc);
				}
				else if(rodadaGanhaJogador > rodadaGanhaPc) {
					System.out.println("Parabéns " + jogador.getNome() + " você ganhou a partida!!!");
					System.out.println("RESULTADO: " + "\n" + jogador.getNome() + ": " + rodadaGanhaJogador 
							+ "\nComputador:" + ": " + rodadaGanhaPc);
				} else {
					System.out.println("O computador ganhou a partida!!!");
					System.out.println("RESULTADO: " + "\n" + jogador.getNome() + ": " + rodadaGanhaJogador 
							+ "\nComputador:" + ": " + rodadaGanhaPc);
				}
				
	}
}
