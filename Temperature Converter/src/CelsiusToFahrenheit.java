class CelsiusToFahrenheit {
    double tempertature;
    CelsiusToFahrenheit(double t){
        tempertature=t;
    }
    void setCelsiusToFahrenheit(){
        double celsiustofahrenheit=(tempertature*9/5)+32;
        System.out.println("Celsius To Fahrenheit "+celsiustofahrenheit);
    }
}
