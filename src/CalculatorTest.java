import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void testAddition() {
        Result result = Calculator.calculate(Arrays.asList(1, 2, 3), OperatorType.ADDITION);
        assertEquals(6, result.getTotal());
        assertEquals(Arrays.asList("1", "+2 (=3)", "+3 (=6)"), result.getSteps());
    }

    @Test
    public void testMultiplication() {
        Result result = Calculator.calculate(Arrays.asList(2, 3, 4), OperatorType.MULTIPLICATION);
        assertEquals(24, result.getTotal());
        assertEquals(Arrays.asList("2", "*3 (=6)", "*4 (=24)"), result.getSteps());
    }
}
