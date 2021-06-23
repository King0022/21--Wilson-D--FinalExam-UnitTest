package Final.maven2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalcTestActual {

private StringCalculator stringCalc;
	
	@BeforeEach
    public void setUp() {
       stringCalc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalc = null;
    }
	
	@Test
	public void testNegativeException() {
		String numbers = "-1, 3";
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> stringCalc.add(numbers));
		assertEquals("negative numbers not allowed", exception.getMessage());
	}

}
