package culture.africa.ci.wildcards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WildcardUpperUnboundTest {
    private Mere mere;

    @BeforeEach
    void setUp() {
        mere = new Mere();
    }

    @Test
    void OnlyNullCanBeAddOnWildcardUpperUnbound() {
        //given
        List<? extends Number> list = new ArrayList<>();
        //when
        list.add(null);
        //then
        assertEquals(null, list.get(0));
    }

    @Test
    void calculateUpperUnboundWithIntegerList() {
        //given
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        //when
        Number result = mere.calculate(integerList);
        //then
        assertEquals(6.0, result);
    }

    @Test
    void calculateUpperUnboundWithDoubleList() {
        //given
        List<Double> doubleList = Arrays.asList(1.0, 2.1, 3.2);
        //when
        Number result = Double.parseDouble(new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US)).format(mere.calculate(doubleList)));
        //then
        assertEquals(6.3, result);
    }

    @Test
    void calculateUpperUnboundWithFloatList() {
        //given
        List<Float> floats = Arrays.asList(1.0f, 2.1f, 3.2f);
        //when
        Number result = Float.parseFloat(new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US))
                .format(mere.calculate(floats)));
        //then
        assertEquals(6.3f, result);
    }
}