import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //declaro las variables y tiutlo la app

        System.out.println("Programa para hacer pedido de tela en pulgadas");
        System.out.println("**********************************************");

        double telapulgadas;
        final double equipulgada = 0.0254;
        double telametro;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese pedido de telas en pulgadas");
        telapulgadas= keyboard.nextDouble();

        //proceso

        telametro = telapulgadas/equipulgada;

        //mostrar el resultado

        System.out.println("El pedido en pulgadas es:" + telametro);



    }
}
