import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        //defino las variables

        double altrect;
        double baserect;
        double arearect;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario

        System.out.println("Ingrese altura del rectangulo");
        altrect= keyboard.nextDouble();
        System.out.println("Ingrese la base del rectangulo");
        baserect= keyboard.nextDouble();

        //realizo el proceso y lo gaurdo en la variable arearect
        arearect= altrect * baserect;

        //muestro por pantalla el resultado

        System.out.println("El area del rectangulo es: " + arearect);

    }
}
