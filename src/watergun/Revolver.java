package watergun;

public class Revolver {
    
     // Atributos
    private int posicionActual;
    private int posicionAgua;
    
    // Constructor parametrizado
    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    // Constructor vacío
    public Revolver() {
    }
    
    // Getters y Setters
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    // Método toString()

    @Override
    public String toString() {
        return "\t ~ REVOLVER DE AGUA ~" + "\n- Posición Actual: " + posicionActual + "\n- Posición del Agua: " + posicionAgua;
    }
    
}
