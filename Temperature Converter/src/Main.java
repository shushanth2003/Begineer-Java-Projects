import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the Temperature : ");
            double temperature= in.nextDouble();
            CelsiusToFahrenheit c_to_f = new CelsiusToFahrenheit(temperature);
            FahrenheittoCelsius f_to_c = new FahrenheittoCelsius(temperature);
            CelsiustoKelvin c_to_k = new CelsiustoKelvin(temperature);
            Kelvintocelsius k_to_c = new Kelvintocelsius(temperature);
            FahrenheittoKelvin f_to_k = new FahrenheittoKelvin(temperature);
            KelvintoFahrenheit k_to_f = new KelvintoFahrenheit(temperature);
            System.out.print("Enter the First Section of Celsius,Fahrenheit,Kelvin (Enter into small character)");
            char firstsection = in.next().charAt(0);
            System.out.print("Enter the Second Section of Celsius,Fahrenheit,Kelvin (Enter into Small Character)");
            char secondsection = in.next().charAt(0);
            if(firstsection=='c' && secondsection=='f'){
                c_to_f.setCelsiusToFahrenheit();
            }else if(firstsection=='f' && secondsection=='c'){
                f_to_c.setFahrenheittoCelsius();
            } else if (firstsection=='c' && secondsection=='k') {
                c_to_k.setCelsiusToKelvin();
            }else if(firstsection=='k' && secondsection=='c'){
                k_to_c.setKelvinToCelsius();
            }else if(firstsection=='f' && secondsection=='k'){
                f_to_k.setFahrenheittoKelvin();
            } else if (firstsection=='k' && secondsection=='f') {
                k_to_f.setKelvintoFahrenheit();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}