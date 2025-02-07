class FahrenheittoKelvin {
    double temperature;
    FahrenheittoKelvin(double t){
        temperature=t;
    }
    void setFahrenheittoKelvin(){
        double fahrenheittokelvin=(temperature-32)*5/2+273.15;
        System.out.println("Fahrenheit To Kelvin : "+fahrenheittokelvin);
    }
}
