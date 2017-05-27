package by.developer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Kiryl Drabysheuski
 */
public class InnerFunctionalInterface {

    private static final Logger LOG = LogManager.getLogger(InnerFunctionalInterface.class);

    @Test
    public void predicateTest() {
        Predicate<String> stringPredicate = a -> (a.equalsIgnoreCase("Kiryl"));
        LOG.info(stringPredicate.test("kiryl"));

        Predicate<String> nonNullPredicate = new Predicate<String>() {
            @Override
            public boolean test(String aBoolean) {
                return Objects.nonNull(aBoolean);
            }
        };
        LOG.info(nonNullPredicate.test("hi"));

        Predicate<String> nonNullPredicateMethodReference = Objects::nonNull;
        boolean test = nonNullPredicateMethodReference.negate().test(null);
        LOG.info(test);

        Predicate<String> predicate = (Objects::nonNull);
        predicate.and(String::isEmpty);
    }

    @Test
    public void functionTest() {
        Function<String, Integer> function = Integer::valueOf;
        Integer integer = function.apply("123");
        LOG.info("result: {}", integer);
    }


}
