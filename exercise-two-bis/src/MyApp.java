import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa
        System.out.println("Programa para determinar tipo de cambio mexicano a dolares");

        double dollarAmount;
        double amountOfMexicanPesos;
        final double DOLLAR_PRICE = 22.28;

        //METODO PARA INGRESAR DATOS CON EL TECLADO

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de pesos mexicanos");
        amountOfMexicanPesos = keyboard.nextDouble();

        //PROCESO

        dollarAmount = amountOfMexicanPesos/DOLLAR_PRICE;
        //String.format("%.2f", dollarAmount) redondeo los digitos a dos decimales
        System.out.println("Usted puede adquirir:" + String.format("%.2f", dollarAmount));


    }
}
