import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 10 + 1);
        int intentosMax = 5;
        boolean acertado = false;

        System.out.println("¡Bienvenido! He pensado un número entre 1 y 10. Tienes 5 intentos.");

        for (int i = 1; i <= intentosMax; i++) {
            System.out.print("Intento " + i + ": Ingrese un número: ");
            int respuesta = scanner.nextInt();

            if (respuesta == numeroSecreto) {
                System.out.println("¡Excelente! Adivinaste el número.");
                acertado = true;
                break;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        if (!acertado) {
            System.out.println("Te quedaste sin intentos. El número era: " + numeroSecreto);
        }
    }
}
