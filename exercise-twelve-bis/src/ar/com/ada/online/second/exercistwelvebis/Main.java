package ar.com.ada.online.second.exercistwelvebis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaro las variables y doy titulo al programa

        System.out.println("Programa para para\n" +
                "determinar cuánto pagará una persona por un artículo equis, considerando\n" +
                "que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con\n" +
                "descuento y el precio final)");

        double price;
        final double DISCOUNT = 0.20;
        final double IVA = 0.21;
        double amountDiscount;
        double priceWithDiscount;
        double amountIva;
        double lastPrice;

        //metodo para ingresar datos por teclado keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        price = keyboard.nextDouble();

        //proceso
        amountDiscount = price * DISCOUNT;
        priceWithDiscount = price - amountDiscount;
        amountIva = priceWithDiscount * IVA;
        lastPrice = priceWithDiscount + amountIva;
        System.out.printf("Los montos son: \nPrecio con descuento $ %5.2f \nPreciofinal $ %5.2f", priceWithDiscount, lastPrice);

    }
}
