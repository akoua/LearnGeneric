package culture.africa.ci.wildcards;

import java.util.List;

public class Mere {

    public Number calculate(List<? extends Number> values) {
        Double result = 0.0;
        for (Number n : values) {
            result += n.doubleValue();
        }
        return result;
    }
}

