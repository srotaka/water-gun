package watergun;

import java.util.List;
import java.util.Scanner;

public class JuegoService {
    
    
     // llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(List<Jugador> jugadoresList, Revolver revolver) {
        JugadorService jService = new JugadorService();
        RevolverService rService = new RevolverService();

        rService.llenarRevolver(revolver);
        jService.crearJugador(jugadoresList);
        jService.imprimirJugadores(jugadoresList);
        System.out.println(".........................");
        System.out.println("\n\tLET THE GAME BEGIN!!");
    }

    // ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. 
    // Sí el revolver tira el agua el jugador se moja y se termina el juego. Si no se moja, 
    // se pasa al siguiente jugador hasta que uno se moje. Sí o sí alguien se tiene que mojar. 
    // Al final del juego, se debe mostrar qué jugador se mojó.
    public void ronda(List<Jugador> jugadoresList, Revolver revolver) {
        JugadorService jService = new JugadorService();
        RevolverService rService = new RevolverService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        do {
            for (Jugador jugador : jugadoresList) {
                if (jService.disparo(revolver, jugadoresList) == true) {
                    System.out.println("\n¡¡Es el turno del " + jugador.getId() + "!!\nGet ready " + jugador.getNombreJugador() + "!!\n3... 2... 1... ¡PUM!");
                    System.out.println("¡¡Mala suerte!! " + jugador.getNombreJugador() + " ha sido eliminado. \n\n\t~ GAME OVER ~");
                    break;

                } else if (jService.disparo(revolver, jugadoresList) == false) {
                    System.out.println("\n¡¡Es el turno del " + jugador.getId() + "!!\nGet ready " + jugador.getNombreJugador() + "!!\n3... 2... 1... ¡PUM!");
                    System.out.println("¡UFFF... QUÉ SUERTE " + jugador.getNombreJugador() + "! El chorro de agua se encuentra en otra posición.\n");
                    System.out.print("Presione cualquier tecla para pasar de turno.");
                    String nextTurn = read.next();
                    System.out.println(".........................");
                    rService.siguienteChorro(revolver);
                }
            }
        } while (jService.disparo(revolver, jugadoresList) == false);
    }
}
