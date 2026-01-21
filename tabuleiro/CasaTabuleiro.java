package tabuleiro;

import pecas.Peca;

public class CasaTabuleiro {

    private String cor;
    private final char letra;
    private final int numero;
    private Peca peca;

    public CasaTabuleiro(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
        this.peca = null;
    }

    public boolean estaVazia() {
        return peca == null;
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

    public void setCor(String cor){
        this.cor = cor;
    }

    public String representacao(){
        if(estaVazia()){
            return ".";
        }
        return peca.getSimbolo();
    }

}
