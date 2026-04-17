import java.util.Scanner;

public class AccesoDobleFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Fase 1: Credenciales (3 intentos)
        String usuarioCorrecto = "admin";
        int passCorrecta = 1234;
        boolean loginExitoso = false;

        System.out.println("--- INICIO DE SESIÓN ---");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Usuario: ");
            String user = scanner.next();
            System.out.print("Password: ");
            int pass = scanner.nextInt();

            if (user.equals(usuarioCorrecto) && pass == passCorrecta) {
                loginExitoso = true;
                break;
            } else {
                System.out.println("Datos incorrectos. Intento " + i + " de 3.");
            }
        }

        // Fase 2: Código SMS (Solo si la Fase 1 fue exitosa)
        if (loginExitoso) {
            // Genera código aleatorio de 3 dígitos (entre 100 y 999)
            int smsGenerado = (int) (Math.random() * 900 + 100);
            System.out.println("\n[SISTEMA] Código SMS enviado: " + smsGenerado);
            boolean smsCorrecto = false;

            for (int j = 1; j <= 2; j++) {
                System.out.print("Ingrese el código SMS (Intento " + j + " de 2): ");
                int smsUser = scanner.nextInt();

                if (smsUser == smsGenerado) {
                    System.out.println("¡Acceso total concedido! Bienvenido.");
                    smsCorrecto = true;
                    break;
                }
            }

            if (!smsCorrecto) {
                System.out.println("Código SMS incorrecto. Sesión bloqueada.");
            }
        } else {
            System.out.println("Usuario bloqueado por demasiados intentos fallidos.");
        }
    }
}
