package ar.com.ada.online.second.exercisetenbis;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaro las variables y doy titulo al programa
        System.out.println("Programa para determinar el pago que debe realizar una persona por el total de\n" +
                "metros cúbicos que consume de agua");

        final double COST_CUBIC_METERS = 100;
        double watersMeters;
        double cost;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese metros cubicos de agua:");
        watersMeters = keyboard.nextDouble();

        //proceso

        cost = COST_CUBIC_METERS * watersMeters;

        System.out.println("El costo a pagar por el consumo del agua es:" + cost);
    }
}
