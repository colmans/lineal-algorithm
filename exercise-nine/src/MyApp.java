import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        //declaro las variables y titulo la app

        System.out.println("Programa para obtener sueldo semanal");

        double workhours;
        double salaryhour;
        double weeksalary;

        //metodo para ingresar datos

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese horas trabajadas:");
        workhours = keyboard.nextDouble();
        System.out.println("Ingrese valor de salario por hora:");
        salaryhour = keyboard.nextDouble();

        //realizo el proceso

        weeksalary = workhours * salaryhour;

        //muestro el resultado

        System.out.println("El salario semanal es de: " + weeksalary);
    }
}
