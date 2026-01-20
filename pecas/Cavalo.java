package pecas;

import tabuleiro.CasaTabuleiro;

public class Cavalo extends Peca {

    public Cavalo(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual) {
        super(cor, casaInicial, casaAtual);
    }

    @Override
    public boolean movimentoValido(CasaTabuleiro destino) {
        return false;
    }

    @Override
    public String getSimbolo() {
        return cor.equals("WHITE") ? "♘" : "♞";

    }
}
