import java.util.Objects;
public class Factura {
    String folio;
    String cliente;
    double total;
    public Factura(String folio,String cliente,double total){
        this.folio= folio;
        this.cliente=cliente;
        this.total =total;
    }
    public String toString(){
        return "Factura{ " +"Folio:" +folio+'\''+"Cliente" +cliente + '\'' +"Total"+total+  '}';

    };
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return this.folio.equals(otro.folio) &&
                this.cliente.equals(otro.cliente) &&
                this.total == otro.total;
    }
    public int hashCode() {
        return Objects.hash(folio, cliente, total);
    }

}



