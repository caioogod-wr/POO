/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_invaders;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author caioo
 */
public class Space_Invaders extends Application {
    private BooleanProperty MoveDireita = new SimpleBooleanProperty();
    private BooleanProperty MoveEsquerda = new SimpleBooleanProperty();
    private BooleanBinding keyPressed = MoveDireita.or(MoveEsquerda);

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        FXMLDocumentController controlador = loader.getController();

        stage.setTitle("Space Invaders");
        stage.setScene(scene);
        stage.show();
        
        // Método que trata as ações do jogador
        ComandosJogador(controlador, scene);
        
        
    }
    
    public void ComandosJogador(FXMLDocumentController controlador, Scene scene)  {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if(MoveDireita.get()) {
                    controlador.moveDireita();
                }

                if(MoveEsquerda.get()) {
                    controlador.moveEsquerda();
                }
            }
        };
        
        pegaInputTeclado(controlador, scene);
        
        keyPressed.addListener(((observableValue, aBoolean, t1) -> {
            if(observableValue.getValue()){
                timer.start();
            } else {
                timer.stop();
            }
        }));
    }
    public void pegaInputTeclado(FXMLDocumentController controlador, Scene scene) {
        scene.setOnKeyPressed(event -> {
            switch(event.getCode()) {
                case A:
                    MoveEsquerda.set(true);
                    break;
                    
                case D:
                    MoveDireita.set(true);
                    break;
                    
                case SPACE:
                    controlador.atiraPlayer();
                    break;
                    
                    
                case ESCAPE:
                    //libera listener
                    //libera monte de coisa
                    System.exit(0);
            }
        });
        
        scene.setOnKeyReleased(event -> { 
            switch(event.getCode()) {
                case A:
                    MoveEsquerda.set(false);
                    break;
                    
                case D:
                    MoveDireita.set(false);
                    break;
            }
        });
    } 

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
