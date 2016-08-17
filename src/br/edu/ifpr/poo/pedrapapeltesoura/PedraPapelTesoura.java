package br.edu.ifpr.poo.pedrapapeltesoura;

import java.util.Scanner;

public class PedraPapelTesoura {

	private Scanner scanner;
	
	public PedraPapelTesoura(){
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		new PedraPapelTesoura().executar();
	}
	
	public void executar(){
		boolean fim = false;
		int j1, j2;
		Jogada jogada1, jogada2;
		do {
			
			jogada1 = getJogada("Jogada 1");
			jogada2 = getJogada("Jogada 2");
			System.out.println("Jogo");
			System.out.println(ComparaJogada.compara(jogada1, jogada2));
			//fim = true;
		} while (!fim);
		scanner.close();
	}

	private Jogada getJogada(String mensagem) {
		int j;
		Jogada jogada;
		System.out.println(mensagem);
		j = scanner.nextInt();
		return Jogada.getJogada(j);
	}

}
