public class Vuelo {
    public static void main(String[] args) {

       final String codigoVuelo;
        String destino;
        String horaSalida;
        Pasajero asientoReservado;

public Vuelo(String codigoVuelo, String destino, String horaSalida) {
            this.codigoVuelo = codigoVuelo;
            this.destino = destino;
            this.horaSalida = horaSalida;
            this.asientoReservado = null;
        }

        public boolean reservarAsiento(Pasajero p) {
            if (asientoReservado == null) {
                asientoReservado = p;
                return true;
            } else {
                return false;
            }
        }
    }

}