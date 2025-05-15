import java.util.Optional;
public class factura {
    private double monto;
    private String descripcion;
     private Optional<String> rfc;

public factura(double monto, String descripcion, String rfc){
    this.monto = monto;
    this.descripcion = descripcion;
    this.rfc = Optional.ofNullable(rfc);
}
    public String getResumen(){
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
}
}
