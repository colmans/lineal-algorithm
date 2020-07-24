import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //defino las variables
        System.out.println("Programa para obtener promedio de calificaciones obtenidas");
        System.out.println("**********************************************************");

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double suma;
        double prom;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //solicito al usuario que ingrese los datos
        System.out.println("ingrese la primera nota");
        nota1=keyboard.nextInt();
        System.out.println("ingrese la segunda nota");
        nota2=keyboard.nextInt();
        System.out.println("ingrese la tercera nota");
        nota3=keyboard.nextInt();
        System.out.println("ingrese la cuarta nota");
        nota4=keyboard.nextInt();

        //realizo el proceso
        suma= nota1 + nota2 + nota3 + nota4;

        //realizo segundo proceso
        prom=suma/4;

        //muestro el promedio

        System.out.println("El promedio de las cuatro notas obtenidas es: " + prom);



    }
}
