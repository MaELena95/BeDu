import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        double TotalSinDescuento = precio * cantidad;

        System.out.println("Total sin Descuento es: " + TotalSinDescuento);

        var aplicaDescuento = TotalSinDescuento > 500;
        double descuento = aplicaDescuento ? TotalSinDescuento * 0.15 : 0;


        double totalConDescuento = TotalSinDescuento - descuento;


        System.out.println("Resumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + TotalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

    }
}
