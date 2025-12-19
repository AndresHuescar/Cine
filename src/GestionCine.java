import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionCine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SalaCine sala = new SalaCine();

        Proyeccion[] proyecciones = new Proyeccion[2];
        proyecciones[0] = new ProyeccionClasica("Casablanca", 5.0);
        proyecciones[1] = new Proyeccion3D("Avatar", 7.0);

        System.out.println("---- GESTIÓN DE CINE ----");

        int opcion = 0;

        do {
            try {
                System.out.println("Elige horario:");
                System.out.println("1. Mañana (" + proyecciones[0].getTitulo() + ")");
                System.out.println("2. Tarde (" + proyecciones[1].getTitulo() + ")");
                System.out.print("Opción: ");

                opcion = sc.nextInt();

                if (opcion < 1 || opcion > 2) {
                    System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número.");
                sc.nextLine();
            }
        } while (opcion < 1 || opcion > 2);

        int asiento = -1;

        do {
            try {
                System.out.print("Introduce número de asiento (1-50): ");
                asiento = sc.nextInt();

                sala.reservarAsiento(asiento);

            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un número.");
                sc.nextLine();
            } catch (AsientoNoDisponibleException e) {
                System.out.println(e.getMessage());
                asiento = -1;
            }
        } while (asiento == -1);

        Proyeccion p = proyecciones[opcion - 1];

        System.out.printf("Reserva confirmada. Precio final: %.2f €\n",
                p.calcularPrecio());

        sc.close();
    }
}
