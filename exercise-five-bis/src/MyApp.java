import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variable y titulo el programa

        System.out.println("Programa para determinar presupuesto de pintura");

        double amountOfMeters;
        final double PRICE_PAINT=100;
        double budget; //presupuesto

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese cantidad de metros para pintar:");
        amountOfMeters= keyboard.nextDouble();

        //proceso

        budget = amountOfMeters * PRICE_PAINT;

        System.out.println("El presupuesto para el pintor:" + budget);
    }
}
