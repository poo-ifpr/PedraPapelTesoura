package br.edu.ifpr.poo.pedrapapeltesoura;

public enum Jogada {

	PEDRA, PAPEL, TESOURA;
	
	
	public static Jogada getJogada(int i){
		switch(i){
		case 0:
			return PEDRA;
		case 1:
			return PAPEL;
		case 2:
			return TESOURA;
		default:
			throw new IllegalArgumentException("Valor Inválido");
		}
	}
}
