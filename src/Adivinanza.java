import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int intentos = 0;
        int numeroAleatorio = rand.nextInt(100);

        while (intentos < 5) {
            System.out.println("Ingrese un numero entre el 1 y el 100: ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades Adivinaste el Número Secreto!");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que escribiste es menor al número secreto.");
            } else {
                System.out.println("El número que escribiste es mayor al número secreto.");
            }
            intentos++;
        }

        if (intentos == 5) {
            System.out.println("Lo sentimos, no adivinaste el numero secreto :(\nEl numero secreto era " + numeroAleatorio);
        }

    }

}
