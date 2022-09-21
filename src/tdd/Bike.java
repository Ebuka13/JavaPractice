package tdd;


public class Bike {
    private boolean power;
    private int speed;
    public void powerOn() {
        power = true;

    }

    public boolean powerStat() {
        return power;
    }

    public void powerOff() {
        power = false;
    }

    public void accelerate(int gear) {
        if (gear <= 20){
            speed = gear + 1;
        } else if (gear <=30) {
            speed = gear + 2;

        } else if (gear <= 40) {
            speed = gear + 3;

        } else if (gear > 41) {
            speed = gear + 4;
        }
    }
    public int getSpeed(){
        return speed;
    }

    public void decelerate(int gear) {
        if (gear <= 20){
            speed = gear - 1;
        } else if (gear <=30) {
            speed = gear - 2;

        } else if (gear <= 40) {
            speed = gear - 3;

        } else if (gear > 41) {
            speed = gear - 4;
        }
    }
}