import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //defino las variables
        System.out.println("Programa para obtener el area de una circunferencia");
        System.out.println("***************************************************");

        double radio;
        final double pi= 3.141592;
        double area;

        //creo el metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        //solicito el ingreso de datos

        System.out.println("Ingrese radio de la circunferencia");
        radio= keyboard.nextDouble();

        //hacer el proceso
        area= pi * radio * radio;

        //mostrar datos por teclado

        System.out.println("El area de la circunferencia es:" + area);

    }
}
