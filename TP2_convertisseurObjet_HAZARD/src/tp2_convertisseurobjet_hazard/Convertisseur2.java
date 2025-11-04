/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_hazard;

/**
 *
 * @author romai
 */
public class Convertisseur2 {
    int nbConversions=0;


    public double CelciusVersKelvin(double tCelcius) {
        return (tCelcius + 273);
    }

    public double KelvinVersCelcius(double tKelvin) {
        return (tKelvin - 273);
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        return ((tFarenheit - 32) * (5.0 / 9.0));
    }

    public double CelciusVersFarenheit(double tCelcius) {
        return ((9.0 / 5.0) * tCelcius + 32);
    }

    public double KelvinVersFarenheit(double tKelvin) {
        return ((9.0 / 5.0) * (tKelvin - 273) + 32);
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        return ((tFarenheit - 32) * (5.0 / 9.0) + 273);
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }
}
