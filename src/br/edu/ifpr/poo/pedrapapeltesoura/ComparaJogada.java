package br.edu.ifpr.poo.pedrapapeltesoura;

public class ComparaJogada {

	private final static int EMPATE = 0;
	private final static int VITORIA = -1;
	private final static int DERROTA = 1;
	
	public static int compara(Jogada jogada1, Jogada jogada2){
		if(jogada1 == jogada2){
			return EMPATE;
		}
		else if(jogada1 == Jogada.TESOURA){
			if(jogada2 == Jogada.PAPEL){
				return VITORIA;
			}
			else{
				return DERROTA;
			}
		}
		else if(jogada1 == Jogada.PEDRA){
			if(jogada2 == Jogada.TESOURA){
				return VITORIA;
			}
			else{
				return DERROTA;
			}
		}
		else if(jogada2 == Jogada.PEDRA){
			return VITORIA;
		}
		else{
			return DERROTA;
		}
	}
}
