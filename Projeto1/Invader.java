package projeto1;

/**classe que representa um único invasor
 * @author caioo
 * @version 1.2
 * @since 1.0
 */
public class Invader extends Entity {
    /**Caractere que representa o invasor na tela*/
    protected String body = "!";
    
    /**Construtor da classe; define as coordenadas horizontais do objeto
     * @param x coordenada horizontal do objeto
     * @param y coordenada vertical do objeto
     */
    public Invader(int x, int y) {
        super(x, y);
    }
    
    /**Método para obter o caractere que representa o objeto na tela
     * @return o caractere que representa o objeto na tela
     */
    public String getBody() {
        return body;
    }
}
