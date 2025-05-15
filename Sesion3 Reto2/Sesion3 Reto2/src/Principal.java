public class Principal {
    public static void main(String[] args) {

    factura facturaConRFC = new factura(595.0, "Comidas", "SaTF654351");

    factura facturaSinRFC = new factura(385.0, "cena", null);

    System.out.println(facturaConRFC.getResumen());
    System.out.println(facturaSinRFC.getResumen());
}
}