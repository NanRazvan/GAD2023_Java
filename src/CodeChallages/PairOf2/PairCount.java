package CodeChallages.PairOf2;

import java.util.HashSet;

public class PairCount {
    public static int countPairs(int[] arr) {
        int pairCount = 0;
        HashSet<Integer> visited = new HashSet<>();

        for (int num : arr) {
            int negation = -num;
            if (visited.contains(negation)) {
                pairCount++;
                visited.remove(negation);
            } else {
                visited.add(num);
            }
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,-3,-2,3,0};
        int numberOfPairs = countPairs(arr);
        System.out.println("Number of pairs: " + numberOfPairs);
    }
}