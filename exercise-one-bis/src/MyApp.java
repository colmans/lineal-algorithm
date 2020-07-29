import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa
        System.out.println("Programa para obtener el area de un triangulo");

        double base;
        double eight;
        double area;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese base");
        base = keyboard.nextDouble();

        System.out.println("ingrese altura");
        eight = keyboard.nextDouble();

        //proceso
        area = (base * eight)/2;

        System.out.println("El area de un triangulo es: " + area);


    }
}
