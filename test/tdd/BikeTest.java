package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void switchOn() {
        Bike benz = new Bike();
        benz.powerOn();
        assertTrue(benz.powerStat());
    }
    @Test
    public void switchOff(){
        Bike benz = new Bike();
        benz.powerOff();
        assertFalse(benz.powerStat());
    }
    @Test
    public void acceleration(){
        Bike benz = new Bike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        benz.accelerate(25);
        assertEquals(27,benz.getSpeed());

    }
    @Test
    public void deceleration(){
        Bike benz = new Bike();
        benz.powerOn();
        assertTrue(benz.powerStat());
        benz.decelerate(25);
        assertEquals(23,benz.getSpeed());


    }
}