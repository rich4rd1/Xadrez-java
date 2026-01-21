package pecas;

import tabuleiro.CasaTabuleiro;

public class Torre extends Peca {

    public Torre(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual) {
        super(cor, casaInicial, casaAtual);
    }

    @Override
public boolean movimentoValido(CasaTabuleiro destino) {
    int linhaAtual = casaAtual.getNumero();
    char colunaAtual = casaAtual.getLetra();

    int linhaDestino = destino.getNumero();
    char colunaDestino = destino.getLetra();

    // não pode ficar parado
    if (linhaAtual == linhaDestino && colunaAtual == colunaDestino) {
        return false;
    }

    // mesma linha OU mesma coluna
    return linhaAtual == linhaDestino || colunaAtual == colunaDestino;
}

    @Override
    public String getSimbolo() {
        return cor.equals("WHITE") ? "♖" : "♜";

    }

}
