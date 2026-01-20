package pecas;

import tabuleiro.CasaTabuleiro;

public class Rei extends Peca{

    public Rei(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual){
        super(cor, casaInicial, casaAtual);
    }

    @Override
    public boolean movimentoValido(CasaTabuleiro destino){
        return false;
    }


    @Override
    public String getSimbolo(){
        return cor.equals("WHITE") ? "♔" : "♚";
    
    }
}