package culture.africa.ci.wildcards;

import culture.africa.ci.interfaces.ICalculable;
import culture.africa.ci.interfaces.ILoggingAction;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculLogging implements ICalculable, ILoggingAction {
    @Override
    public String calcul() {
        return "Logging";
    }

    @Override
    public void logging(String message) {
        log.info(message);
    }
}
