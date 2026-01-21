
import jogo.JogoXadrez;
import tabuleiro.Tabuleiro;

public class Main {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.inicializarCasas();
        tabuleiro.montarPartidaPadrao();    
        
        JogoXadrez jogo = new JogoXadrez(tabuleiro);
        jogo.move(0, 0, 5, 0);
        tabuleiro.mostraTabuleiro();
        
    }
}
