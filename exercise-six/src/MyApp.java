import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo la app

        System.out.println("Programa para obtener el area de una figura");
        System.out.println("*******************************************");

        double r;
        double h;
        double c;
        double at;
        double ac;
        final double pi=3.1416;
        double area;


        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese base del triangulo rectangulo y radio");
        r= keyboard.nextDouble();
        System.out.println("Ingrese hipotenusa del triangulo rectangulo");
        h=keyboard.nextDouble();

        // hacer el proceso
        c= Math.sqrt((h*h)-(r*r) );
        at= 2 * (r*c)/2;
        ac = (pi * r * r) / 2;
        area = at  + ac;

        //mostrar resultado
        System.out.println("El area de la figura es: " + area);






    }
}
