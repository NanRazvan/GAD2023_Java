package CodeChallages.GenericIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayIterator<Integer> it2 = new ArrayIterator<>(list);

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


    }
}
