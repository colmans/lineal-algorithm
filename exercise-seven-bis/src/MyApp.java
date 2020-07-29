import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro variables y titulo programa

        System.out.println("Programa para determinar el costo que tendrá el boleto");
        System.out.println("******************************************************");

        double km;
        final double COST_OF_KM=100;
        double priceOfTicket;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de kilometros:");
        km = keyboard.nextDouble();

        //PROCESO
        priceOfTicket = km * COST_OF_KM;

        System.out.println("El boleto tiene un costo de:" + priceOfTicket);


    }
}
