import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {
//        Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
//        sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los
//        gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros
//        gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de
//        flujo y pseudocódigo que representen el algoritmo que determine el monto del cheque.

        //declarar las variables y darle nombre al programa

        System.out.println("Programa para determinar el monto de un cheque");
        System.out.println("**********************************************");

        int daysnumber;
        int hotelcost;
        int foodcost;
        final int priceperday = 100;
        int amountperday;
        int th;
        int tf;
        int total;

        //metodo para ingrersar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese numero de dias");
        daysnumber = keyboard.nextInt();
        System.out.println("Ingrese monto de hotel");
        hotelcost = keyboard.nextInt()
        System.out.println("INgrese monto de comida");
        foodcost = keyboard.nextInt();


        // hacer proceso

        amountperday = daysnumber * priceperday;
        th = daysnumber * hotelcost;
        tf = daysnumber * foodcost;
        total = amountperday + th + tf;

        // mostrar resultado

        System.out.println("El monto del cheque es de: " + total);


    }
}
