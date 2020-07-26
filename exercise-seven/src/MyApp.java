import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo la app

        System.out.println("Venta de galones de leche por dia");
        System.out.println("*********************************");

        double liters;
        double price;
        double gallons;
        final double tool = 3.785;
        double gain;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        //solicito que ingresen los datos

        System.out.println("Ingrese la cantidad de litros que produce");
        liters = keyboard.nextDouble();
        System.out.println("Ingrese precio del galon");
        price = keyboard.nextDouble();

        //hago el proceso
        gallons = liters / tool;
        gain = price * gallons;

        //muestro el resultado


        System.out.println("La venta del productor lechero en un dia es: " + gain);






    }
}
