package space_invaders;

/**classe que representa as barreiras
 * @author caioo
 * @version 1.0
 * @since 1.0
 */
public class Blockade {
    /**quantidade de dano tomado pelas barricadas*/
    protected int damage;
    
    /**coordenada horizontal da barricada*/
    protected int x;
    
    /**coordenada vertical da barricada*/
    protected int y;
    
    /**Construtor da classe; especifica coordenadas iniciais
     * @param x coordenada horizontal do objeto
     * @param y coordenada vertical do objeto
     */
    public Blockade(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
