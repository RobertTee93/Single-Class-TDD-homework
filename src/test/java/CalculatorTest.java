import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals(6, calculator.add(4, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(12, calculator.subtract(24, 12));
    }

    @Test
    public void canMultiply(){
        assertEquals(36, calculator.multiply(6, 6));
    }

    @Test
    public void canDivide(){
        assertEquals(10, calculator.divide(100, 10));
    }

}
