package projeto1;

/**Classe que representa a tela que será mostrada no terminal
 * @author caioo
 * @version 1.3
 * @since 1.0
 */
public class Screen {
    /**tamanho horizontal da tela (quantidade de "pixels" que compõe a tela na horizontal)*/
    protected int x;
    /**tamanho vertical da tela (quantidade de "pixels" que compõe a tela na vertical)*/
    protected int y;
    
    /**matriz de pixels que compõe a tela*/
    protected Pixel [][] pixels;
    
    /**matriz de pixels na qual todos os pixels possuem a imagem "default"; é utilizada para limpar a tela ("resetar" as imagens dos pixels)*/
    protected Pixel [][] clean_screen;
    
    /**Construtor da classe
     * @param x tamanho horizontal da tela
     * @param y tamanho vertical da tela
     */
    public Screen(int x, int y) {
        this.x = x;
        this.y = y;
        pixels = new Pixel [y][x];
        clean_screen = new Pixel [y][x];
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                pixels[i][j] = new Pixel();
                clean_screen[i][j] = new Pixel();
            }
        }
    }
    
    /**Método para obter o tamanho horizontal da tela*/
    public int getSizeX() {
        return x;
    }
    /**Método para obter o tamanho vertical da tela*/
    public int getSizeY() {
        return y;
    }
    
    /**Método para imprimir a tela no terminal*/
    public void printScreen() {
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                System.out.print(pixels[i][j].getImage());
            }
            System.out.print("\n");
        }
        System.out.println("=".repeat(45));
    }
    
    /**método para definir a imagem de um "pixel" em específico
     * @param x coordenada horizontal do pixel a ser modificado (coluna na qual "pixel" se encontra na matriz que represneta a tela)
     * @param y coordenada vertical do pixel a ser modificado (linha na qual "pixel" se encontra na matriz que represneta a tela)
     * @param image 
     */
    public void setPixel(int x, int y, String image) {
        try {
            pixels[y][x].setImage(image);
        } catch (Exception e) {
            System.out.println("Posicao de pixel invalida");
        }
    }
    
    /**Método para limpar a tela (definir a imagem de todos os "pixels" para o caractere "default")*/
    public void CleanScreen() {
        for(int i = 0; i < y; i++)
            for(int j = 0; j < x; j++)
                pixels[i][j].setImage(clean_screen[i][j].getImage());
    }
    
}
