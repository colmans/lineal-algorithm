package ar.com.ada.online.second.exercistherteenbis;

public class Main {

    public static void main(String[] args) {
	//declaro las variables y doy titulo al programa

        System.out.println("Programa para determinar cuánto dinero ahorra una persona en un año");

        final double SALARY = 35000;
        final double SALARY_PERCENTAGE= 0.15;
        double savingPerMont;
        double annualSaving;

        //proceso

        savingPerMont = SALARY * SALARY_PERCENTAGE;
        annualSaving = savingPerMont * 12;

        System.out.println("El ahorro anual es: " + annualSaving);
    }
}
