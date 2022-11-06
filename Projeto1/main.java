package projeto1;

/**
 * @author caioo
 * @version 1.0
 * @since 1.0
 */
public class main {
    public static void main(String[] args) {
        Game game = new Game();
        
        System.out.println("Pressione enter para passar de tela ou \"q\" caso queira sair do jogo");
        System.out.println("Nesta versão, os invasores são representados por \"!\" ");
        
        /**Inicia jogo*/
        game.run();
    }
}
