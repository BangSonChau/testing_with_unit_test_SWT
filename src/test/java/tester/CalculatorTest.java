package tester;

import com.son.testingWithUnitTest.entity.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setup() {
        c = new Calculator();
    }

    @Test
    @DisplayName("Test: 1+5=6")
    void testFunc() {
        int result = c.add(1,5);
        Assertions.assertEquals(6,result,"1+5 phải bằng 6");
    }
}

