public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Elena", "Elen122");

        Vuelo vuelo = new Vuelo("MX001", "Mexico", "19:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada.\n");
        } else {
            System.out.println(" No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();


        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Moises D", "Duam0019");
        System.out.println(vuelo.obtenerItinerario());
    }
}