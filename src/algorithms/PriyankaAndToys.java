package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Monil on 3/15/16.
 */
public class PriyankaAndToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] weights = new int[t];
        for(int a0 = 0; a0 < t; a0++) {
            weights[a0] = in.nextInt();
        }

        System.out.println(getMinUnits(weights));
    }

    private static int getMinUnits(int[] weights) {

        Arrays.sort(weights);
        int currentWeight = weights[0], cost = 1;
        for(int i=0; i < weights.length; i++) {
            if(weights[i] <= (currentWeight + 4)) {
                continue;
            }
            currentWeight = weights[i];
            cost++;
        }

        return cost;
    }
}
