package CodeChallages.Leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Leaders {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 4, 1, 6, 3, 1));
        Integer max = Integer.MIN_VALUE;

        for(int i=list.size()-1;i>=0;i--)
        {
            if(list.get(i)>max)
            {
                System.out.println(list.get(i) + " - Is a leader");
                max = list.get(i);
            }
        }
    }

}
