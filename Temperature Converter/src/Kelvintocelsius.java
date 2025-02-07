class Kelvintocelsius {
    double temperature;
    Kelvintocelsius(double t){
        temperature=t;
    }
    void setKelvinToCelsius(){
        double kelvintocelsius=temperature-273.15;
        System.out.println("Kelvin to Celsius : "+kelvintocelsius);
    }
}
