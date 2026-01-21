package pecas;

import tabuleiro.CasaTabuleiro;

// esse abstract aqui impede a criação de uma nova peça do tipo peça
// peca so serve para guardar atribuitos genericos e metodos de ultilização global para as peças especificas
public abstract class Peca {

    protected String cor;
    protected CasaTabuleiro casaAtual;
    protected CasaTabuleiro casaInicial;

    public Peca(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual) {
        this.cor = cor;
        this.casaAtual = casaInicial;
        this.casaInicial = casaInicial;
        this.casaAtual = casaInicial;
    }

    public String getCorPeca() {
        return cor;
    }

    public CasaTabuleiro getCasaAtual() {
        return casaAtual;
    }

    // possivelmente no futuro isso aqui quebre ao colocarmos a logica de comer peças ou de movimentos, atenção!!
    public boolean moverPara(CasaTabuleiro destino) {
        casaAtual.desocupaCasa();
        //aqui ocorre o movimento para a casa nova
        destino.ocupaCasa(this);
        //aqui firmamos que a nova casa é a nossa casa atual
        this.casaAtual = destino;
        return true;

    }

    public abstract String getSimbolo();

    public abstract boolean movimentoValido(CasaTabuleiro destino);

    @Override
    public String toString() {
        return cor + " " + casaAtual + " " + casaInicial;
    }
}
