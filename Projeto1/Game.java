package projeto1;
import java.util.Scanner;

/**Classe que coordena a execução do jogo
 * @author caioo
 * @version 1.5
 * @since 1.0
 */
public class Game {
    /**variável que indica fim de jogo*/
    protected boolean EndGame;
    
    /**variável que guardará input do jogador*/
    protected String input;
    /**objeto da classe "Scanner" para receber input do teclado*/
    Scanner sc;
    
    /**objeto que representa a tela do jogo*/
    protected Screen screen;
    
    /**objeto que representa a nave do jogador*/
    protected Ship ship;
    
    /**númeroo de linhas da matriz dos invasores*/
    protected int InvadersRows;
    /**número de colunas da matriz dos invasores*/
    protected int InvadersColumns;
    /**matriz dos invasores*/
    protected Invader [][] invaders;
    
    /**Construtor da Classe; inicializa os objetos e variáveis necessários*/
    public Game(){
        /**inicializa fim do jogo como falso*/
        EndGame = false;
        
        /**inicializa "sc" para receber "input" do teclado*/
        sc = new Scanner(System.in);
        
        /**inicializa tela e suas dimensões*/
        screen = new Screen(40,20);
        
        /**inicializa nave do jogador*/
        ship = new Ship(0,0);
        
        /**inicializa a matriz de invasores*/
        InvadersRows = 5;
        InvadersColumns = 11;
        invaders = new Invader[InvadersRows][InvadersColumns];
        /**inicializa cada invasor da matriz na posição (j,i), velocidade horizontal 1 e velocidade vertical 0*/
        for(int i = 0; i < InvadersRows; i++) {
            for(int j = 0; j < InvadersColumns; j++) {
                invaders[i][j] = new Invader(j,i);  /**coordenada x é o "j" e a y é o "i"*/
                invaders[i][j].setVx(1);
                invaders[i][j].setVy(0);
            }
        }
    }
    
    public void run() {
        /**laço de repetição do jogo*/
        while(!EndGame) {
            /**"pinta" pixels com invasores*/
            for(int i = 0; i < InvadersRows; i++) {
                for(int j = 0; j < InvadersColumns; j++)
                    screen.setPixel(invaders[i][j].getX(), invaders[i][j].getY(), invaders[i][j].getBody());
            }
            
            /**printa tela*/
            screen.printScreen();
            
            /**limpa tela*/
            screen.CleanScreen();
            
            /**confere se os invasores chegaram à borda da tela*/
            if((invaders[0][10].getX() == (screen.getSizeX() - 1)) || ((invaders[0][0].getY() != 0) && (invaders[0][0].getX() == 0))) {
                /**se a velocidade vertical deles for 0, ou seja, eles não pularam de linha na última iteração*/
                if(invaders[0][0].getVy() == 0) {
                    for(int i = 0; i < InvadersRows; i++) {
                        for(int j = 0; j < InvadersColumns; j++) {
                            /**muda velocidades para os invasores pularem de linha*/
                            invaders[i][j].setVx(0);
                            invaders[i][j].setVy(1);
                        }
                    }
                }
                /**se a velocidade vertical deles for diferente de 0, ou seja, eles pularam de linha na última iteração*/
                else  {
                    for(int i = 0; i < InvadersRows; i++) {
                        for(int j = 0; j < InvadersColumns; j++) {
                            invaders[i][j].setVy(0);
                            /**se os invasores estiverem na borda esquerda da tela, eles devem ir para a direita*/
                            if(invaders[0][0].getX() == 0)
                                invaders[i][j].setVx(1);
                            /**se os invasores estiverem na borda direita da tela, eles devem ir para a esquerda*/
                            else
                                invaders[i][j].setVx(-1);                    
                        }
                    }
                }
            }
            
            /**atualiza posição dos invasores*/
            for(int i = 0; i < InvadersRows; i++) {
                for(int j = 0; j < InvadersColumns; j++) {
                    invaders[i][j].move(1);
                }
            }
            
            /**recebe input do teclado na forma de string*/
            input = sc.nextLine();
            /**continua o jogo até que o jogador digite "q"*/
            if(input.equals("q"))
                EndGame = true;
        }
        
    }
}
