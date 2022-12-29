/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_invaders;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author caioo
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private ImageView imagemPlayer = new ImageView();
    
    @FXML
    private ImageView tiro = new ImageView();
    private boolean atirou;
    
    @FXML
    private AnchorPane scene = new AnchorPane();
    private double LARGURA_TELA;
    private double ALTURA_TELA;
    
    // Classe que representa o jogador
    private Ship player;
    
    // Classe utilizada para tratar animação do tiro
    AnimationTimer timerTiro;
    
    private Invader[][] invasores;
    private int INVASORES_LINHAS = 5;
    private int INVASORES_COLUNAS = 11;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        LARGURA_TELA = scene.getWidth();
        ALTURA_TELA = scene.getHeight();
        
        player = new Ship(imagemPlayer.getLayoutX(), imagemPlayer.getLayoutY(), imagemPlayer);
        
        atirou = false;
        
        inicializaInvasores();
            
            
            
            
            //Adiciona Listener no scene para ratar colisões??
        

    }
    
    public void inicializaInvasores() {
        invasores = new Invader[INVASORES_LINHAS][INVASORES_COLUNAS];
        Image imagem = null;
        for(int i = 0; i < INVASORES_LINHAS; i++) {
            switch(i) {
                    case 0:
                        imagem = new Image("Imagens/Alien1.png");
                        break;
                    case 1:
                        imagem = new Image("Imagens/Alien2.png");
                        break;
                    case 2:
                        imagem = new Image("Imagens/Alien2.png");
                        break;
                    case 3:
                        imagem = new Image("Imagens/Alien3.png");
                        break;
                    case 4:
                        imagem = new Image("Imagens/Alien4.png");
                        break;
                }
            for(int j = 0; j < INVASORES_COLUNAS; j++) {
                ImageView imagemInvasor = new ImageView();
                imagemInvasor.setImage(imagem);
                imagemInvasor.setFitWidth(40);
                imagemInvasor.setFitHeight(35);
                imagemInvasor.setLayoutX(j*(imagemInvasor.getFitWidth() + 7));
                imagemInvasor.setLayoutY(i*(imagemInvasor.getFitHeight() + 7));
                invasores[i][j] = new Invader(imagemInvasor.getLayoutX(), imagemInvasor.getLayoutY(), imagemInvasor);
                scene.getChildren().add(imagemInvasor);
            }
        }
    }
    
    public void moveEsquerda() {
        if(player.getX() > 0)
            player.setX(player.getX() - 5);
    }
    public void moveDireita() {
        if(player.getX() < scene.getWidth() - imagemPlayer.getFitWidth())
            player.setX(player.getX() + 5);
    }
    
    public void atiraPlayer() {
        if(atirou)
            return;
        
        tiro.setLayoutX(player.getX());
        tiro.setLayoutY(player.getY() - imagemPlayer.getFitHeight());
        moveTiro();
        timerTiro.start();
        atirou = true;
    }
    /**Metodo para mover o tiro*/
    public void moveTiro() {
        timerTiro = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                // Se o tiro saiu da tela
                if(tiro.getLayoutY() < -tiro.getFitHeight()) {
                    //encerra movimentação do tiro
                    timerTiro.stop();
                    atirou = false;
                }
                //movimenta tiro
                tiro.setLayoutY(tiro.getLayoutY()-4);
            }
        };
    }

}