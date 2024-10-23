import java.util.Random;
import java.util.Scanner;

public class numAleatorio {

        public static void main(String[] args) {

            int numeroAleatorio = new Random().nextInt(100);
            Scanner teclado = new Scanner(System.in);
            System.out.println("Juego Adivina el numero");
            System.out.println("Ingrese un numero");
            int numeroUsuario = teclado.nextInt();

            System.out.println("Ingresaste le numero " + numeroUsuario + " El numero era " +numeroAleatorio);
        }
    }


