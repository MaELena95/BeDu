public class Principal {
    public static void main(String[] args) {


    Entrada Entrada = new Entrada(" cine", 75.5);

    Entrada.mostrarInformacion();
    // Muestra el toString() generado automáticamente por el record.
        System.out.println(Entrada);
}
}