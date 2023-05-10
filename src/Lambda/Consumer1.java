package Lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1(){

        List<String> lista= new ArrayList<String>(Arrays.asList("a","b","c"));

        Consumer<List<String>> consumer = l -> l.clear();

        consumer.accept(lista);

        Assert.assertEquals(lista, new ArrayList<>());

    }
}
