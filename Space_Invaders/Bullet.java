package space_invaders;

import javafx.scene.image.ImageView;

/**classe que representa os tiros das naves
 * @author caioo
 * @version 1.0
 * @since 1.0
 */
public class Bullet extends Entity {
    /**velocidade horizontal do objeto*/
    protected int Vx;
    /** velocidade vertical do objeto*/
    protected int Vy;
    
    /**Construtor da classe; especifica coordenadas do objeto
     * @param x coordenada horizontal do objeto
     * @param y coordenada vertical do objeto
     */
    public Bullet(int x, int y, ImageView imagem) {
        super(x, y, imagem);
    }
    
}
