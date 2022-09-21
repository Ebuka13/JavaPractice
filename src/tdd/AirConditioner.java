package tdd;

public class AirConditioner {
    private boolean power;
    private int temperature;

    public boolean powerMode(){
        return power;
    }

    public void turnon(){
        if (power == false){
            power = true;
        }
    }

    public void turnoff() {
        if (power == false) {
             power = true;
        }
    }

    public void setTemperature(int degree) {
        if (temperature >= 16) {
            if (temperature <= 30) {
                temperature = degree;
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int degree) {

    if (temperature < 16) {
        temperature = 0;
        }
    }
}
