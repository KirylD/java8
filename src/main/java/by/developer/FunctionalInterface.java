package by.developer;

import by.developer.inter.FuncInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterface {

    private static final Logger LOG = LogManager.getLogger(FunctionalInterface.class);

    @Test
    public void createFuncInterface() {
        FuncInterface funcInterface = ((a) -> "create FunInterface object for you, " + a);
        LOG.info(funcInterface.doFuncMethod("Kiryl"));

    }

    @Test
    public void sortListWithFuncInterface() {
        List<String> list = Arrays.asList("Kiryl", "Dasha", "Oleg");
    }

    @Test
    public void useLinkToMethod() {
        FuncInterface funcInterface = (a) -> {
            return "hi, " + a;
        };
        String kiryl = funcInterface.doFuncMethod("Kiryl");
        LOG.info(kiryl);
    }

    @Test
    public void linkToMethodOfObject() {
        FuncInterface funcInterface = new FunctionalInterface()::toLowerCase;
        String kirylLowerCase = funcInterface.doFuncMethod("Kiryl");
        LOG.info(kirylLowerCase);
    }

    private String toLowerCase(String str) {
        return str.toLowerCase();
    }

}
