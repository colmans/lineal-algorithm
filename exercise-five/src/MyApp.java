import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        //defino las variables y titulo la app

        System.out.println("Programa que permite obtener el area de un terreno");
        System.out.println("**************************************************");

        double radio;
        final double pi= 3.141592;
        double area;
        double areatri;
        double arearect;
        double areafigura;

        // metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        //solicito que ingrese los datos

        System.out.println("Ingresar radio de la circunferencia");
        radio = keyboard.nextDouble();
        System.out.println("Area de la circunferencia");
        area = keyboard.nextDouble();

        //Hacer el proceso
        areatri = (radio * (pi - area)) / 2 ;
        arearect = radio * area;
        areafigura = areatri + arearect;

        //mostrar el resultado

        System.out.println("El area del terreno es: " + areafigura);


    }
}
