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

        int daysNumber;
        double hotelcost;
        double foodcost;
        final int priceperday = 100;
        double amountperday;
        double totalHotel;
        double totalFood;
        double total;

        //metodo para ingrersar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese numero de dias");
        daysNumber = keyboard.nextInt();
        System.out.println("Ingrese monto de hotel");
        hotelcost = keyboard.nextDouble();
        System.out.println("Ingrese monto de comida");
        foodcost = keyboard.nextDouble();


        // hacer proceso

        amountperday = daysNumber * priceperday;
        totalHotel = daysNumber * hotelcost;
        totalFood = daysNumber * foodcost;
        total = amountperday + totalHotel + totalFood;

        // mostrar resultado
        //System.out.println("El monto del hotel: " + totalHotel);
        //System.out.println("El monto de comida: " + totalFood);
        //System.out.println("El monto del cheque es de: " + total);
        //metodo para concatenar variables %d es para variables int, si es con double %5.2f(2 indica cantidad de decimales)
        System.out.printf("Los montos son: \nHotel $ %5.2f \nComida $ %5.2f \nTotal $ %5.2f", totalHotel, totalFood, total);

    }
}
