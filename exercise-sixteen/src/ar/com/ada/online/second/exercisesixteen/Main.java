package ar.com.ada.online.second.exercisesixteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declaro las variables y doy titulo al programa

        System.out.println("Programa para determinar \n" +
                "el área de un cuadrado. ");

        double sideOfSquare;
        double squareArea;

        //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese el area del cuadrado;");
        sideOfSquare = keyboard.nextDouble();

        //proceso
        squareArea = sideOfSquare * 4;

        System.out.println("El area de un cuadrado es:" + squareArea);
    }
}