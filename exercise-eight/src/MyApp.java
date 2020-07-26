import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        //declaro las variable y titulo mi app

        System.out.println("Programa para obtener distancias entre dos puntos");

        double equisuno;
        double equisdos;
        double yeuno;
        double yedos;
        double catetoabs;
        double catetoord;
        double distancia;

        //metodo para ingresar los datos

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la primera equis");
        equisuno = keyboard.nextDouble();
        System.out.println("Ingrese la primera ye");
        yeuno = keyboard.nextDouble();
        System.out.println("Ingrese la segunda equis");
        equisdos = keyboard.nextDouble();
        System.out.println("Ingrese la segunda ye");
        yedos = keyboard.nextDouble();

        //realizo el proceso

        catetoabs = equisdos - equisuno;
        catetoord = yedos - yeuno;
        distancia = Math.sqrt((catetoabs * catetoabs) + (catetoord * catetoord));

        //muestro el resultado

        System.out.println("La distancia entre dos puntos es: " + distancia);
    }
}
