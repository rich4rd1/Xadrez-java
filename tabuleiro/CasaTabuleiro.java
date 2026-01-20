package tabuleiro;

import pecas.Peca;

public class CasaTabuleiro {

    private final String cor;
    private char letra;
    private int numero;
    private Peca peca;

    public CasaTabuleiro(String cor, char letra, int numero) {
        this.cor = cor;
        this.letra = letra;
        this.numero = numero;
        this.peca = null;
    }

    public boolean estaVazia() {
        return peca == null;
    }

    public String getPosicao() {
        return letra + "" + numero;
    }

    //Ocupando o tabuleiro
    public void ocupaCasa(Peca peca) {
        this.peca = peca;
    }

    //Desocupando a casa 
    public void desocupaCasa() {
        this.peca = null;
    }

    //Pegando a peca
    public Peca getPeca() {
        return peca;
    }

    public char getLetra() {
        return letra;
    }

    public int getNumero() {
        return numero;
    }

    public String getCor() {
        return cor;
    }

    public String representacao(){
        if(estaVazia()){
            return ".";
        }
        return peca.getSimbolo();
    }

}
