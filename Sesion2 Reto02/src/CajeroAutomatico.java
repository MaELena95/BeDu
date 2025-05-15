import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo_inicial = 1000.0;
        int tipo;

        do {
            // Mostrar menú de opciones
            System.out.println(" Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            tipo = scanner.nextInt();


             switch (tipo) {
                case 1 -> {
                    System.out.println("Tu saldo es."+ saldo_inicial);
                }
                case 2 ->{
                    System.out.print(" Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    saldo_inicial += deposito;
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo_inicial);
                }
                case 3 -> {

                    System.out.print(" monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo_inicial) {
                        System.out.println("Fondo insuficiente Tu saldo es: $" + saldo_inicial);
                    } else {
                        saldo_inicial -= retiro;
                    System.out.println("Saldo actualizado: $" + saldo_inicial);}

                }
                case 4 -> {
                    System.out.println("Gracias ");
                }
                default -> {
                    System.out.println("Entrada  no válido.");
                  }
                }

             } while (tipo != 4);

    }
}
