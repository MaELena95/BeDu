public record Entrada_Record(String evento , double precio) {
    public void mostrarInformacion(){
        System.out.println("Nombre de evento" + evento + " | Precio : $ " + precio);

    }
}
