public class ejecutarSquash {

import java.util.Scanner;

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        JugadorSquash js = new JugadorSquash("Xavier", 41, 6.7);

        js.entrenar();
        js.jugarPartido();

        // Imprimir resultados

         System.out.println("El jugador " + js.getNombre());



    }
    
}
