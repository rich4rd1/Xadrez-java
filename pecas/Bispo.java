package pecas;

import tabuleiro.CasaTabuleiro;

public class Bispo extends Peca{

    public Bispo(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual){
        super(cor, casaInicial, casaAtual);
    }

    @Override
    public boolean movimentoValido(CasaTabuleiro destino){
        return false;
    }


    @Override
    public String getSimbolo() {
        return cor.equals("WHITE") ? "♗" : "♝";

    }
}