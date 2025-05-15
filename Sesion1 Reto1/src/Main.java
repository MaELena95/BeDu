import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    Paciente paciente = new Paciente();

        System.out.print("Nombre del paciente: ");
    paciente.Nombre = scanner.nextLine();

        System.out.print("Edad de paciente: ");
    paciente.Edad_Paciente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número de expediente: ");
    paciente.numeroExpediente = scanner.nextLine();

        paciente.mostrarInformacion();


        scanner.close();
}
    }
