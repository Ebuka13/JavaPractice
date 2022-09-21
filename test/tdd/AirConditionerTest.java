package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    public class AirConditionerTest {
        @Test
        public void turnon() {
            AirConditioner myAirConditioner = new AirConditioner();
            myAirConditioner.turnon();
            assertTrue(myAirConditioner.powerMode());
        }

        @Test
        public void turnoff() {
            AirConditioner myAirConditioner = new AirConditioner();
            myAirConditioner.turnoff();
            assertFalse(myAirConditioner.powerMode());
        }

        @Test
        public void setTemperature() {
            AirConditioner myAirConditioner = new AirConditioner();
            myAirConditioner.turnon();
            myAirConditioner.setTemperature(17);
            assertEquals(17, myAirConditioner.getTemperature());
        }

        @Test
        public void decreaseTemperature() {
            AirConditioner myAirconditioner = new AirConditioner();
            myAirconditioner.setTemperature(30);
            myAirconditioner.decreaseTemperature(4);
            assertEquals(26, myAirconditioner.getTemperature());
        }
    }
