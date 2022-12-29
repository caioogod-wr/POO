package space_invaders;

/**Classe que representa cada "espaço" da tela do terminal
 * @author caioo
 * @version 1.1
 * @since 1.0
 */
public class Pixel {
    /**o caractere que será mostrado em determinado pixel é chamado "image"*/
    protected String image;
    
    /**Construtor da classe; define o caractere que será mostrado como "default" no terminal*/
    public Pixel() {
        image = "-";
    }
    
    /**Método para obter o caractere do pixel
     * @return caractere do pixel
     */
    public String getImage() {
        return image;
    }
    
    /**Método para definir o caractere do pixel
     * @param image novo caractere que será mostrado pelo pixel
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    
}
