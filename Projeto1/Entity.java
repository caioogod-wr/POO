package projeto1;

/**Classe "Pai" de todos os seres/objetos que compõe o jogo
 * @author caioo
 * @version 1.3
 * @since 1.0
 */
public abstract class Entity {
    /**posição horizontal do objeto*/
    protected int x;
    /**posição vertical do objeto*/
    protected int y;

    /**velocidade horizontal do objeto*/
    protected int Vx;
    /** velocidade vertical do objeto*/
    protected int Vy;

    /**Construtor da classe; especifica coordenadas iniciais
     * @param x coordenada horizontal do objeto
     * @param y coordenada vertical do objeto
     */
    public Entity (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**Método de definição do valor da coordenada horizontal do objeto
     * @param x novo valor da coordenada horizontal do objeto
     */
    public void setX(int x) {
        this.x = x;
    }
    /**Método de definição do valor da coordenada vertical do objeto
     * @param y novo valor da coordenada vertical do objeto
     */
    public void setY(int y) {
        this.y = y;
    }
    /**Método de definição do valor da velocidade horizontal do objeto
     * @param Vx novo valor da velocidade horizontal do objeto
     */
    public void setVx(int Vx) {
        this.Vx = Vx;
    }
    /**Método de definição do valor da velocidade vertical do objeto
     * @param Vy novo valor da velocidade vertical do objeto
     */
    public void setVy(int Vy) {
        this.Vy = Vy;
    }

    /**Método para obter valor da coordenada horizontal do objeto
     * @return valor da coordenada horizontal
     */
    public int getX() {
        return x;
    }
    /**Método para obter valor da coordenada vertical do objeto 
     * @return valor da coordenada vertical
     */
    public int getY() {
        return y;
    }
    /**Método para obter valor da velocidade horizontal do objeto
     * @return valor da velocidade horizontal
     */
    public int getVx() {
        return Vx;
    }
    /**Método para obter valor da velocidade vertical do objeto 
     * @return valor da velocidade vertical
     */
    public int getVy() {
        return Vy;
    }

    /**Método para mudar coordenadas da entidade com base em sua velocidade
     * @param time fator que representa o tempo na fórmula matemática utilizada para obter a distância percorrida
     */
    public void move(int time) {
        x += (time*Vx);
        y += (time*Vy);
    }
    
    /**Método para inverter velocidade horizontal*/
    public void invertVx() {
        Vx = -Vx;
    }
}
