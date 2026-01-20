
import tabuleiro.Tabuleiro;

public class Main {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.inicializarCasas();
        tabuleiro.montarPartidaPadrao();
        tabuleiro.mostraTabuleiro();

    }
}
