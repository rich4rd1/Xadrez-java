package tabuleiro;

import pecas.Bispo;
import pecas.Cavalo;
import pecas.Peao;
import pecas.Peca;
import pecas.Rainha;
import pecas.Rei;
import pecas.Torre;

public final class Tabuleiro {

    public CasaTabuleiro[][] casas;
    String corCasa;

    public Tabuleiro() {
        casas = new CasaTabuleiro[8][8];
        inicializarCasas();
    }

    public void inicializarCasas() {

        //vou colocar na posição [0][0] a letra + numero A1
        // vou somar a letra + 1 para virar B
        //depois vou incrementar a posição de coluna e colocar agora o B1
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {

                int numero = linha + 1;
                char letra = (char) ('A' + coluna);

                if (linha % 2 == 0) {
                    //começa a preencher as corCasaes com preto
                    corCasa = (coluna % 2 == 0) ? "BLACK" : "WHITE";
                } else {
                    corCasa = (coluna % 2 == 0) ? "WHITE" : "BLACK";
                }
                casas[linha][coluna] = new CasaTabuleiro(letra, numero);
                casas[linha][coluna].setCor(corCasa);
            }
        }
    }

    public CasaTabuleiro getCasa(int linha, int coluna) {
        return casas[linha][coluna];
    }
    
    public void montarPartidaPadrao() {
        //peoes brancos 
        for (int coluna = 0; coluna < 8; coluna++) {
            CasaTabuleiro casa = getCasa(1, coluna);
            Peca peao = new Peao("WHITE", casa, casa);
            casa.ocupaCasa(peao);
        }

        //peoes pretos
        for (int coluna = 0; coluna < 8; coluna++) {
            CasaTabuleiro casa = getCasa(6, coluna);
            Peca peao = new Peao("BLACK",casa,casa);
            casa.ocupaCasa(peao);
        }

        //torres brancas
        for (int coluna = 0; coluna < 8; coluna++) {
            if (coluna == 0 || coluna == 7) {
                CasaTabuleiro casa = getCasa(0, coluna);
                Torre torre = new Torre("WHITE", casa, casa);
                casa.ocupaCasa(torre);
            }
        }

        //torres pretas
        for (int coluna = 0; coluna < 8; coluna++) {
            if (coluna == 0 || coluna == 7) {
                CasaTabuleiro casa = getCasa(7, coluna);
                Torre torre = new Torre("BLACK", casa, casa);
                casa.ocupaCasa(torre);
            }
        }

        //cavalos brancos 
        getCasa(0, 1).ocupaCasa(new Cavalo("WHITE", getCasa(0, 1),getCasa(0, 1)));
        getCasa(0, 6).ocupaCasa(new Cavalo("WHITE", getCasa(0, 6),getCasa(0, 6)));

        //cavalos pretos
        getCasa(7, 1).ocupaCasa(new Cavalo("BLACK", getCasa(7, 1),getCasa(7, 1)));
        getCasa(7, 6).ocupaCasa(new Cavalo("BLACK", getCasa(7, 6), getCasa(7, 6)));

        //bispos brancos
        getCasa(0, 5).ocupaCasa(new Bispo("WHITE", getCasa(0, 5), getCasa(0, 5)));
        getCasa(0, 2).ocupaCasa(new Bispo("WHITE", getCasa(0, 2), getCasa(0, 2)));

        //bispos pretos
        getCasa(7, 2).ocupaCasa(new Bispo("BLACK", getCasa(7, 2), getCasa(7, 2)));
        getCasa(7, 5).ocupaCasa(new Bispo("BLACK", getCasa(7, 5), getCasa(7, 5)));

        //Reis
        getCasa(0, 3).ocupaCasa(new Rei("WHITE", getCasa(0, 3), getCasa(0, 3)));
        getCasa(7, 3).ocupaCasa(new Rei("BLACK", getCasa(7, 3), getCasa(7, 3)));

        //Rainhas
        getCasa(0, 4).ocupaCasa(new Rainha("WHITE", getCasa(0, 4), getCasa(0, 4)));
        getCasa(7, 4).ocupaCasa(new Rainha("BLACK", getCasa(7, 4), getCasa(7, 4)));
    }

    public void mostraTabuleiro() {
        for (int linha = 7; linha >= 0; linha--) {
            for (int coluna = 0; coluna < 8; coluna++) {
                System.out.print(casas[linha][coluna].representacao() + " ");
            }
            System.out.println();
        }
    }

}

