import java.util.Scanner;

public class EjecutadorTrabajadores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Ingresa el tipo de trabajador que vas a registrar: ");
        int TipoTrabajador = teclado.nextInt();
        GestorTrabajadoresArrayMT[] p = new GestorTrabajadoresArrayMT[100];
        //GestorTrabajadoresArrayTC[] g = new GestorTrabajadoresArrayTC[100];
        switch (TipoTrabajador) {
            case 1:
            System.out.println("Ingresa los datos en este Orden:  cedulaIdentidad;\r\n" + //
                                "Nombres;\r\n" + //
                                " YearNacimiento;\r\n" + //
                                " Direccion; "+ //
                                " Salario Mesnsual;\r\n" + //
                                " Horario Laboral;\r\n" );
            TiempoCompleto n = new TiempoCompleto(teclado.nextLine(), teclado.nextLine(), teclado.nextLine(), teclado.nextLine(), teclado.nextInt(), teclado.nextInt());
                

                break;
            case 2:
            System.out.println("Ingresa los datos en este Orden:  cedulaIdentidad;\r\n" + //
                                "Nombres;\r\n" + //
                                " YearNacimiento;\r\n" + //
                                " Direccion; "+ //
                                " Salario por Hora;\r\n" + //
                                " Cantidad Horas Mensuales;\r\n" );
                MedioTiempo m = new MedioTiempo(teclado.nextLine(), teclado.nextLine(), teclado.nextLine(), teclado.nextLine(), teclado.nextInt(), teclado.nextInt());
                
        
        }
        

    }

}
