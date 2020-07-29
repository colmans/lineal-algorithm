import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa

        System.out.println("Programa para determinar la hipotenusa de un triángulo rectángulo");

        double catetoBase;
        double catetoAltura;
        double hipotenusa;

        //metodo para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese medida del cateto de la base");
        catetoBase = keyboard.nextDouble();
        System.out.println("Ingrese medida del cateto de la altura");
        catetoAltura = keyboard.nextDouble();

        //proceso
        //funcion para raiz cuadrada Math.sqrt
        //funcion para potencia math.pow(variable,numero de la potencia)
        hipotenusa = Math.sqrt(Math.pow(catetoBase, 2)+ (catetoAltura*catetoAltura));
        System.out.println("La hipotenusa del triangulo rectangulo es: " + String.format("%.2f" , hipotenusa)  );

    }
}
