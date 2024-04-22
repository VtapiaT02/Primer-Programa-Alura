import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        String nombreCliente = "Victor Tapia";
        String tipoCuenta = "Corriente";
        int entradaUsuario = 0;
        double entradaDinero;

        System.out.printf("""
                ****************************************
                
                Nombre del Cliente: %s
                Tipo de Cuenta: %s
                Saldo Disponible: $%.2f
                
                ***************************************\n
                """, nombreCliente, tipoCuenta, saldo);


        while (entradaUsuario != 9) {
            System.out.println("""
                    ** Escriba el número de la opción deseada **
                    1 - Consultar Saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);

            System.out.print("Seleccione una opción: ");
            entradaUsuario = sc.nextInt();

            if (entradaUsuario == 1) {
                System.out.printf("""
                        
                        ************************************
                        Su saldo actual es de: $%.2f
                        ************************************
                        
                        """, saldo);
            } else if (entradaUsuario == 2) {
                System.out.println("""
                        
                        *******************************************
                        ¿Cuanto dinero deseas retirar?
                        *******************************************
                        """);

                System.out.print("Cantidad: $");
                entradaDinero = sc.nextDouble();

                if (entradaDinero > saldo) {
                    System.out.println("\nNo cuenta con fondos suficientes para realizar este movimiento");
                } else {
                    saldo -= entradaDinero;
                }
                System.out.printf("""
                        
                        ***************************************
                        Su saldo actual es de: $%.2f
                        ***************************************
                        
                        """, saldo);

            } else if (entradaUsuario == 3) {
                System.out.println("""
                        
                        *******************************************
                        ¿Cuanto dinero deseas depositar?
                        *******************************************
                        """);

                System.out.print("Cantidad: $");
                entradaDinero = sc.nextDouble();

                saldo += entradaDinero;

                System.out.printf("""
                        
                        ***************************************
                        Su saldo actual es de: $%.2f
                        ***************************************
                        
                        """, saldo);

            } else if (entradaUsuario == 9) {
                System.out.println("""
                        
                        *******************************************************
                        * ¡Gracias por su tiempo, que tenga un excelente dia! *
                        *******************************************************
                        """);
            } else {
                System.out.println("""
                        
                        *********************************************************
                        Esta opción no esta disponible, intentelo de nuevo
                        *********************************************************
                        
                        """);
            }

        }

    }

}
