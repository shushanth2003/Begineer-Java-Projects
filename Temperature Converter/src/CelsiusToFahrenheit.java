class CelsiusToFahrenheit {
    double tempertature;
    CelsiusToFahrenheit(double t){
        tempertature=t;
    }
    void setCelsiusToFahrenheit(){
        double celsiustofahrenheit=(tempertature-32)*5/9;
        System.out.println("Celsius To Fahrenheit "+celsiustofahrenheit);
    }
}
