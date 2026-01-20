package pecas;

import tabuleiro.CasaTabuleiro;

public class Rainha extends Peca{

    public Rainha(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual){
        super(cor, casaInicial, casaAtual);
    }

    @Override
    public boolean movimentoValido(CasaTabuleiro destino){
        return false;
    }

    
    @Override
    public String getSimbolo(){
        return cor.equals("WHITE") ? "♕" : "♛";
    
    }
}