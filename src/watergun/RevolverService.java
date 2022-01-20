package watergun;

public class RevolverService {
     // Método llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
    public Revolver llenarRevolver(Revolver revolver) {
        System.out.println("\n~ SE HA RECARGADO EL REVOLVER DE AGUA ~");
        //RevolverAgua revolver = new Revolver();

        revolver.setPosicionActual((int) (Math.random() * 6));
        revolver.setPosicionAgua((int) (Math.random() * 6));
        System.out.println("- Posición actual: " + revolver.getPosicionActual());
        System.out.println("- Posición del chorro de agua: " + revolver.getPosicionAgua());
        return revolver;
    }

    // Método mojar(): devuelve true si la posición del agua coincide con la posición actual.
    public Boolean mojar(Revolver revolver) {
        Boolean agua = false;

        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            agua = true;
        } else {
            agua = false;
        }
        return agua;
    }

    // Método siguienteChorro(): cambia a la siguiente posición del tambor.
    public void siguienteChorro(Revolver revolver) {

        if (revolver.getPosicionActual() < 5) {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        } else if (revolver.getPosicionActual() == 5) {
            revolver.setPosicionActual(0);
        }
    }

    // Método toString(): muestra información del revolver (posición actual y dónde está el agua).
    public void toString(Revolver revolver) {

        System.out.println(revolver);
    }
}
