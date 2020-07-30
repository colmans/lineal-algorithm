package ar.com.ada.online.second.exercisenineteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declaro las variables y tiutlo el programa
        System.out.println("Programa para determinar lo que le debe cobrar a un huésped por su\n" +
                "estancia en una de sus habitaciones");

        double stayDays;
        final double ROOM_PRICE= 100;
        double costOfStay;

        //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        //proceso
        System.out.println("Ingrese cantidad de dias de alojamiento");
        stayDays = keyboard.nextDouble();
        costOfStay = stayDays * ROOM_PRICE;

        System.out.println("El huesped debera pagar:" + costOfStay);

    }
}
