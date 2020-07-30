package ar.com.ada.online.second.exerciseelevenbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//declaro la variables y doy titulo al programa
        System.out.println("Programa para determinar determinar el pago que debe realizar una\n" +
                "persona por el consumo de energía eléctrica, en kilowatts (KW");

        final double KWATTS_COST=100;
        double amountOfKw;
        double costOfKw;


     //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de KWATTS consumidos:");
        amountOfKw = keyboard.nextDouble();

     //proceso

     costOfKw = KWATTS_COST * amountOfKw;

        System.out.println("El pago a realizar es:" + costOfKw );

    }
}
