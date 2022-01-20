package watergun;

public class Jugador {
    // Atributos
    private String id;
    private String nombreJugador;
    private Boolean mojado;

    // Constructores parametrizados
    public Jugador(String id, String nombreJugador, Boolean mojado) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.mojado = mojado;
    }

    // Constructor vacío
    public Jugador() {
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    // Método toString()
    @Override
    public String toString() {
        return "  " + id + ":\n- Nombre: " + nombreJugador + "\n- ¿Está mojado? " + mojado + "\n";
    }

}
