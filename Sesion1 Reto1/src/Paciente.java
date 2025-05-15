import java.util.Scanner;
public class Paciente {
    String Nombre;
    int Edad_Paciente;
    String numeroExpediente;

    void mostrarInformacion() {
        System.out.println("\n📋 Información del paciente:");
        System.out.println("Paciente: " + Nombre);
        System.out.println("Edad: " + Edad_Paciente);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
