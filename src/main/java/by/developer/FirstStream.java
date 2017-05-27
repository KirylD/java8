package by.developer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * @author Kiryl Drabysheuski
 */
public class FirstStream {

    private static final Logger LOG = LogManager.getLogger(FirstStream.class);

    @Test
    public void launch() {
        Stream<String> stream = Stream.of("a2", "a1", "a3", "b1", "b2");
        stream.sorted().sorted().forEach(LOG::info);
    }

}
