import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import sun.misc.PostVMInitHook;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //defino las variables
        System.out.println("Programa que suma dos numeros dados");
        System.out.println("***********************************");

        int firstNumber;
        int secondNumber;
        int result;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese el primer numero para el calculo: ");
        firstNumber= keyboard.nextInt();
        System.out.print("Ingrese el primer numero para el calculo: ");
        secondNumber= keyboard.nextInt();

        //realizo el proceso y lo guardo en la variable result
        result= firstNumber + secondNumber;

        //muestro el resultado
        System.out.println("El resultado es: " + result);







    }
}
