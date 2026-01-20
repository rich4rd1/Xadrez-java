package pecas;

import tabuleiro.CasaTabuleiro;

public class Peao extends Peca {

    public Peao(String cor, CasaTabuleiro casaInicial, CasaTabuleiro casaAtual){
        super(cor, casaInicial, casaAtual);
    }

    @Override // este metodo está sobrescrevendo um metodo da classe pai, é para isso que o Override serve
    public boolean movimentoValido(CasaTabuleiro destino){
        //logica do movimento
        return  false;
    }

    @Override
    public String getSimbolo(){
        return cor.equals("WHITE") ? "♙" : "♟";
    
    }
    
    

}
