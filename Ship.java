package space_invaders;

import javafx.scene.image.ImageView;

/**classe que representa a nave do jogador
 * @author caioo
 * @version 1.2
 * @since 1.0
 */
public class Ship extends Entity {
    /**Quantidade de "vidas" do objeto, ou seja, quantidade de vezes que ele pode ser atingido por um tiro*/
    protected int lives;
    
    /**Contrutor da classe; define as coordenadas do objeto na tela e a quantidade de vidas
     * @param x coordenada horizontal do objeto
     * @param y coordenada vertical do objeto
     */
    public Ship(double x, double y, ImageView imagem) {
        super(x, y, imagem);
        lives = 3;
    }

    /**Método para decrementar a quantidade de vidas do objeto*/
    public void decrementLives() {
        lives--;
    }
}
