package watergun;

import java.util.List;
import java.util.Objects;


public class Juego {
    
    // Atributos
    private List <Jugador> jugadoresList;
    private Revolver revolver;
    
    // Constructores parametrizados
    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadoresList = jugadores;
        this.revolver = revolver;
    }
    
    // Constructor vacío
    public Juego() {
    }
    
    // Setters y Getters

    public List<Jugador> getJugadores() {
        return jugadoresList;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadoresList = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    // Método para evitar objetos duplicados en la List

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.jugadoresList);
        hash = 89 * hash + Objects.hashCode(this.revolver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.jugadoresList, other.jugadoresList)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }
    
    // Método toString()

    @Override
    public String toString() {
        System.out.println("\n\t~ LET THE GAME BEGIN ~");
        return "- Jugador: " + jugadoresList + "\n- Revolver: " + revolver;
    }
    
    
}
