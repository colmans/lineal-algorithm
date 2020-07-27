import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y doy titulo al programa
        System.out.println("Programa para calcular el pago del consumo de agua");
        System.out.println("**************************************************");

        double a;
        double l;
        double n;
        double cm;
        double v;
        double pag;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese altura de la pileta");
        a = keyboard.nextDouble();
        System.out.println("Ingrese largo de la pileta");
        l = keyboard.nextDouble();
        System.out.println("Ingrese ancho de la pileta");
        n = keyboard.nextDouble();
        System.out.println("Ingrese costo del metro cubico");
        cm = keyboard.nextDouble();

        //realizo el proceso
        v = (a * l * n);
        pag = v * cm;

        //muestro el resultado

        System.out.println("El cliente debe pagar por el llenado de la pileta:" + pag);
    }
}
