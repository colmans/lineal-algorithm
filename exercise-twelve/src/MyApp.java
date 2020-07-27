import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {
        //declarar las variables y darle nombre al programa

        System.out.println("Programa para determinar el monto de un cheque");

        int numdias;
        int montohotel;
        int montocomi;
        final int costodiario = 100;
        int montodiario;
        int th;
        int tc;
        int t;

        //metodo para ingrersar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese numero de dias");
        numdias = keyboard.nextInt();
        System.out.println("Ingrese monto de hotel");
        montohotel = keyboard.nextInt();
        System.out.println("INgrese monto de comida");
        montocomi = keyboard.nextInt();


        // hacer proceso

        montodiario = numdias * costodiario;
        th = numdias * montohotel;
        tc = numdias * montocomi;
        t = montodiario + th + tc;

        // mostrar resultado

        System.out.println("El monto del cheque es de: " + t);






    }
}
