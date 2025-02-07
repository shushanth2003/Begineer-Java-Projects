class KelvintoFahrenheit {
    double temperature;
    KelvintoFahrenheit(double t){
        temperature=t;
    }
    void setKelvintoFahrenheit(){
        double kelvintofahrenheit=(temperature-273.15)*9/15+32;
        System.out.println("Kelvin To Fahrenheit : "+kelvintofahrenheit);
    }
}
