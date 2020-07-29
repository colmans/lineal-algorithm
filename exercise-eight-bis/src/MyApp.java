import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //declaro las variables y titulo el programa
        System.out.println("Programa para determinar cuanto tiempo le lleva a una persona llegar  de una ciudad a otra en bicicleta a velocidad constante ");

        double arrivalPoint;
        double startingPoint;
        double distance;
        final double CONSTANT_VELOCITY= 30;
        double time;

        //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese punto de llegada:");
        arrivalPoint = keyboard.nextDouble();

        System.out.println("Ingrese punto de partida:");
        startingPoint = keyboard.nextDouble();

        //proesos
        distance = arrivalPoint - startingPoint;
        time = distance / CONSTANT_VELOCITY;

        System.out.println("El tiempo que tarda es: " + String.format("%.2f",time) );

    }

}
