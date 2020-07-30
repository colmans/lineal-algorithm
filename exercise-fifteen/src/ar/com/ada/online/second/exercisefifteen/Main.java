package ar.com.ada.online.second.exercisefifteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declaro las variables y doy titulo al programa
        System.out.println("Programa para calcular la potencia eléctrica");

        double intensidad;
        final double RESISTENCIA= 4;
        double v;
        double p;

     // metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la intensidad:");
        intensidad = keyboard.nextDouble();

//        System.out.println("Ingrese la resistencia");
//        resistencia = keyboard.nextDouble();

        //proceso
        v = RESISTENCIA * intensidad;
        p = v * intensidad;

        System.out.println("La potencia electrica es: " + p);

    }
}
