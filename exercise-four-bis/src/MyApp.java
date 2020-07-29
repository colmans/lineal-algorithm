import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa
        System.out.println("Programa para determinar el ingreso de un estacionamiento");
        System.out.println("*********************************************************");

        int hoursAmount;
        final double PRICE_HOURS=100;
        double income;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas");
        hoursAmount = keyboard.nextInt();

        //proceso
        income = hoursAmount * PRICE_HOURS;

        System.out.println("El cliente debe abonar: " + income);

    }
}
