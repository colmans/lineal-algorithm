import java.time.Year;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa

        System.out.println("Programa para determinar la edad de las personas que solicitan trabajo");

        int currentYear;
        int yearOfBirth;
        int age;

        //metodo para ingresar daots por teclado

        Scanner keyboard = new Scanner(System.in);


        currentYear= Year.now().getValue(); //metodo para tomar el año del Sistema Operativo

        System.out.println("Ingrese año de nacimiento");
        yearOfBirth = keyboard.nextInt();

        // proceso
        age = currentYear - yearOfBirth;

        System.out.println("La edad del postulante es: " + age);
    }
}
