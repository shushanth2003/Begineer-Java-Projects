class CelsiustoKelvin {
    double temperature;
    CelsiustoKelvin(double t){
        temperature=t;
    }
    void setCelsiusToKelvin(){
        double celsiustofahrenheit =temperature+273.15;
        System.out.println("Celsius To Kelvin : "+celsiustofahrenheit);
    }
}
