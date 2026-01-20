package pecas;

import tabuleiro.CasaTabuleiro;

public class Torre extends Peca {

    public Torre(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual) {
        super(cor, casaInicial, casaAtual);
    }

    @Override
    public boolean movimentoValido(CasaTabuleiro destino) {
        
        //esse vai pra Peca
        //verifica se não está na mesma casa
        if (destino.getPosicao().equals(casaAtual.getPosicao())) {
            return false;
        }

        //aqui eu pego a linha e coluna que essa peça torre ta
        int linha = casaAtual.getNumero();
        char coluna = casaAtual.getLetra();

        //vai pra peca tbm
        //verificar se tem peça no caminho
        for(int lin = 0 ; lin < 8 ; lin++ ){
            //se casa[linha] tiver peça return false
        }

        // vai pra peca tbm
        //verificar se tem peça no destino
        if(! destino.estaVazia()){
            return false;
        }
        else{
            // se tiver tenho que dar um jeito de ter uma peça aqui para comer peça que está no destino
        }

        
        //verifico se a coluna corresponde com a coluna e se a linha coresponde com a linha que ela está
        //para um caso de movimento livre
        if (linha == destino.getNumero() || coluna == destino.getLetra()) {
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public String getSimbolo() {
        return cor.equals("WHITE") ? "♖" : "♜";

    }

}
