package by.developer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kiryl Drabysheuski
 */
public class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("The main method was started.");
        List<String> list = Arrays.asList("Kiryl", "Dasha", "Oleg", "Tanya");
        LOG.info("The main method was started.");
    }
}
