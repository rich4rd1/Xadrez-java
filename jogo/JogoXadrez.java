package jogo;

import pecas.Peca;
import tabuleiro.CasaTabuleiro;
import tabuleiro.Tabuleiro;

public class JogoXadrez {

    Tabuleiro tabuleiro;

    public JogoXadrez(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean move(int linhaAtual, int colunaAtual, int linhaDestino, int colunaDestino) {
        //atribuição das casas
        CasaTabuleiro origem = tabuleiro.getCasa(linhaAtual, colunaAtual);
        CasaTabuleiro destino = tabuleiro.getCasa(linhaDestino, colunaDestino);

        //pegando a peça da casa
        Peca peca = origem.getPeca();

        //verificar existencia da peça
        if (peca == null) {
            return false;
        }

        //verifica se a casa de destino pode ser ocupada pela regra da peça de movimento
        else if (peca.movimentoValido(destino) == true) {
            peca.moverPara(destino);
            return true;
        }
        else{
            return false;
        }

    }

    //tabuleiro ja esta montado, precisamos pegar uma peça de alguma posição
    //posições são casasTabuleiro, dentro de tabuleiro temos um getCasa
    //getcasa recebe 2 ints no argumento e devolve uma posição na matriz [][];
    //com essa posição na matriz, usamos então para usar a Getpeca de casaTabuleiro
    //agora com a peça podemos verificar se ela tem o movimento valido.
    //como ja temos a peca agora so fazemos um peca.movimentovalido 
    //fim
}
