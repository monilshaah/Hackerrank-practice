package algorithms.search;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/missing-numbers
 */
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[] a = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            a[a0] = in.nextInt();
        }

        t = in.nextInt();
        int[] b = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            b[a0] = in.nextInt();
        }

        printMissingNumbers(a, b);
    }

    private static void printMissingNumbers(int[] a, int[] b) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        List<Integer> missingList = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if(numberMap.containsKey(b[i])) {
                numberMap.put(b[i], numberMap.get(b[i]) + 1);
            } else {
                numberMap.put(b[i], 1);
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(numberMap.containsKey(a[i])) {
                numberMap.put(a[i], numberMap.get(a[i]) - 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            if(entry.getValue() != 0) {
                missingList.add(entry.getKey());
            }
        }

        Collections.sort(missingList);

        for (int num :
                missingList) {
            System.out.print(num + " ");
        }
    }


}
