package tp1_convertisseur_hazard;

import java.util.Scanner;

/**
 * tp1_manipnombresint_hazard Familiarisation avec la syntaxe Java, de manipuler
 * les opérations de base : affectation, boucles, manipulation de tableaux,
 * subtilités de java 22/10/2025 Romain Hazard
 */
public class TP1_convertisseur_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour, saisissez une valeur");
        Scanner sc = new Scanner(System.in);
        double Temp = sc.nextDouble();

        int Conv = 0;

        while (1 > Conv || Conv > 6) {
            System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
            System.out.println("1) De Celcius vers Kelvin");
            System.out.println("2) De Kelvin vers Celcius");
            System.out.println("3) De Farenheit vers Celcius");
            System.out.println("4) De Celcius vers Farenheit");
            System.out.println("5) Kelvin vers Farenheit");
            System.out.println("6) Farenheit vers Kelvin");
            Conv = sc.nextInt();
            if (1 > Conv || Conv > 6) {
                System.out.println("Veuillez choisir une valeur entre 1 et 6");
            }
        }
if(Conv==1){
        System.out.println("La temperature en Kelvin est " + CelciusVersKelvin(Temp));
    }
else if(Conv==2){
    System.out.println("La temperature en Celcius est " + KelvinVersCelcius(Temp));
}else if(Conv==3){
    System.out.println("La temperature en Celcius est " + FarenheitVersCelcius(Temp));
}else if(Conv==4){
    System.out.println("La temperature en Farenheit est " + CelciusVersFarenheit(Temp));
}else if(Conv==5){
    System.out.println("La temperature en Farenheit est " + KelvinVersFarenheit(Temp));
}else if(Conv==6){
    System.out.println("La temperature en Kelvin est " + FarenheitVersKelvin(Temp));
}

}

    public static double CelciusVersKelvin(double tCelcius) {
        return (tCelcius + 273);
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return (tKelvin - 273);
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return ((tFarenheit - 32) * (5.0 / 9.0));
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return ((9.0 / 5.0) * tCelcius + 32);
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return ((9.0 / 5.0) * (tKelvin - 273) + 32);
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return ((tFarenheit - 32) * (5.0 / 9.0) + 273);
    }
}
