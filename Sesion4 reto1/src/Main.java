public class Main {
    public static void main(String[] args) {

        // Creamos dos tickets con los mismos valores
        Factura F1 = new Factura("123", "Elena", 10);
        Factura F2 = new Factura("123", "Maria", 10);


        System.out.println("¿Son iguales? " + F1.equals(F2));


        System.out.println("Factura 1: " + F1.hashCode());
        System.out.println("Factura 2: " + F2.hashCode());
        System.out.println(F1);
        System.out.println(F2);


    }
}

