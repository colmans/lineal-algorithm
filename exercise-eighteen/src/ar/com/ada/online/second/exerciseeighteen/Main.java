package ar.com.ada.online.second.exerciseeighteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declaro las variables y titulo el programa
        System.out.println("Programa para convertir una medida expresada en centimetros en pulgadas");

        double centimeters;
        final double INCH= 2.54; //pulgadas
        double measurementInInches;

        //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese medida en centimetros");
        centimeters = keyboard.nextDouble();

        //proceso
        measurementInInches = centimeters/INCH;

        System.out.println("Medida en pulgadas es:" + String.format("%.2f", measurementInInches));



    }
}
