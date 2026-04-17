import java.util.Scanner;

public class PinBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PIN_CORRECTO = 1234;
        int intentos = 0;
        boolean accesoValido = false;

        while (intentos < 3) {
            System.out.print("Ingrese su PIN: ");
            int pinIngresado = scanner.nextInt();

            if (pinIngresado == PIN_CORRECTO) {
                System.out.println("Acceso correcto.");
                accesoValido = true;
                break;
            } else {
                intentos++;
                System.out.println("PIN incorrecto. Intentos restantes: " + (3 - intentos));
            }
        }

        if (!accesoValido) {
            System.out.println("Tarjeta bloqueada.");
        }
    }
}
