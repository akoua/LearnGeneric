package culture.africa.ci.wildcards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipeBoundTest {
    private CalculLogging calculLogging;

    @BeforeEach
    void setUp() {
        calculLogging = new CalculLogging();
    }

    @Test
    void testMereMultiBound() {
        //when
        String message = Mere.multipleBound(calculLogging);
        //then
        assertEquals("Logging", message);
    }
}
