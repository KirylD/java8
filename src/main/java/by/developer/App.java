package by.developer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kiryl Drabysheuski
 * @since 1.0
 */
public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("The main method starts.");
        List<String> list = Arrays.asList("Kiryl", "Dasha", "Oleg", "Tanya");
        LOG.debug("list contains: {}.", list);


        LOG.debug("after sorting list contains: {}.", list);
        LOG.info("The main method finished.");
    }

}
