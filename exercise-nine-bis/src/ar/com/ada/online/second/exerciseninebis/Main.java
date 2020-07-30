package ar.com.ada.online.second.exerciseninebis;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declarar las variables y dar titulo al programa

        System.out.println("Programa para determinar el costo de una llamada telefónica");
        final double minCost=100;
        double callTime;
        double costCall;

        //metodo para ingresar datos por keyboard

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese duracion de la llamada en minutos:");
        callTime = keyboard.nextDouble();

        //proceso

        costCall = minCost * callTime;

        System.out.println("El costo de la llamada es:" + costCall);




    }
}
