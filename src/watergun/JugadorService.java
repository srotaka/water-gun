/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watergun;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvi
 */
public class JugadorService {
     Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearJugador(List<Jugador> jugadoresList) {
        System.out.println("\n¿Cuántas personas participarán del juego? (1-6 personas)");
        int respuesta = read.nextInt();
        int numeroJugadores = 0;

        if (respuesta <= 6) {
            numeroJugadores = respuesta;
        } else if (respuesta > 6) {
            numeroJugadores = 6;
        }
        System.out.println("¡¡Tendremos " + numeroJugadores + " valientes participantes!!");

        for (int i = 0; i < numeroJugadores; i++) {
            Jugador player = new Jugador();
            String nombre = "";
            player.setId("PLAYER " + (i + 1));
            player.setMojado(false);

            System.out.println("\nID: " + player.getId());
            System.out.print("Ingrese su nombre: ");
            player.setNombreJugador(nombre = read.next().toUpperCase());
            jugadoresList.add(player);
        }
    }

    // Método para imprimir los datos de los jugadores
    public void imprimirJugadores(List<Jugador> jugadoresList) {

        System.out.println("\n.......................................");
        System.out.println("\nLOS PARTICIPANTES SON LOS SIGUIENTES:");
        for (Jugador listaJugadores : jugadoresList) {
            System.out.println(listaJugadores);
        }
    }

    // Método disparo(Revolver r): el método recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver. 
    // El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
    public boolean disparo(Revolver revolver, List<Jugador> jugadoresList) {
        RevolverService rService = new RevolverService();
        Boolean mojado = false;

        for (Jugador jugador : jugadoresList) {
            mojado = rService.mojar(revolver);
        }
        return mojado;
    }
}
