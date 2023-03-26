package culture.africa.ci.wildcards;

import culture.africa.ci.interfaces.ICalculable;
import culture.africa.ci.interfaces.ILoggingAction;

import java.util.List;

public class Mere {

    public static <T extends ICalculable & ILoggingAction> String multipleBound(T entity) {
        String message = entity.calcul();
        entity.logging(message);
        return message;
    }

    public Number calculate(List<? extends Number> values) {
        Double result = 0.0;
        for (Number n : values) {
            result += n.doubleValue();
        }
        return result;
    }
}

