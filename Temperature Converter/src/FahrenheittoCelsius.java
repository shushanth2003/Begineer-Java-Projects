class FahrenheittoCelsius {
    double tempertature;
    FahrenheittoCelsius(double t){
        tempertature=t;
    }
    void setFahrenheittoCelsius(){
        double celsiustokelvin =(tempertature*9/5)+32;
        System.out.println("Celsius To Fahrenheit "+ celsiustokelvin);
    }
}
