package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Monil on 3/15/16.
 */
public class TwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a, b;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            a = new int[n];
            b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            System.out.println(isArrangementPresent(a, b, n, k));
        }
    }

    private static String isArrangementPresent(int[] a, int[] b, int n, int k) {

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            if (a[i] + b[n-i-1] >= k) {
                continue;
            }
            return "NO";
        }

        return "YES";
    }
}
