package algorithms.implementation;

/**
 * Created by Monil on 4/1/16.
 */
public class MaxDifference {
    public static void main(String[] args) {
        int[] a = {2, 3, 10, 2, 4, 8, 1};
        System.out.println(maxDifference(a));
    }

    static int maxDifference(int[] a) {
        int minSoFar = a[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < a.length ; i++) {
            if(minSoFar < a[i]) {
                maxDiff = Math.max(maxDiff, a[i] - minSoFar);
            } else {
                minSoFar = a[i];
            }

        }
        return maxDiff;
    }

}
