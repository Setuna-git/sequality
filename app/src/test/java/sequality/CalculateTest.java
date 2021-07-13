package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }
    public void testave() {
        Calculate calculate = new Calculate();
        double expected = 2.5;
        assertEquals(expected, calculate.average(2, 3));
    }
    public void testmaxsum(){
        Calculate calculate = new Calculate();
        int expected = 55;
        assertEquals(expected, calculate.maxsum(1, 10));
    }
    public void testmaxave(){
        Calculate calculate = new Calculate();
        double expected = 2.5;
        assertEquals(expected, calculate.maxave(1, 10));
    }
    public void testoddmax(){
        Calculate calculate = new Calculate();
        int expected = 25;
        assertEquals(expected, calculate.oddmax(1, 10));
    }
    public void testevenave(){
        Calculate calculate = new Calculate();
        int expected = 30;
        assertEquals(expected, calculate.evenmax(1, 10));
    }
}