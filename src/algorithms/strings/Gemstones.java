package algorithms.strings;

import java.util.Scanner;

/**
 * Created by Monil on 3/16/16.
 */
public class Gemstones {

    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=Integer.parseInt(stdin.nextLine());
        String[] gems = new String[n];
        for(int i=0; i < n; i++) {
            gems[i] = stdin.nextLine();
        }

        System.out.println(getGemElementsCnt(gems));
    }

    private static int getGemElementsCnt(String[] gems) {
        int cnt = 0;
        int[] elements = new int[26];

        for(int i=0; i < gems.length; i++) {
            for(char ch: gems[i].toCharArray()) {
                if (elements[ch - 'a'] == i) {
                    elements[ch - 'a'] = i + 1;
                }
            }
        }

        for (int elem : elements) {
            if (elem == gems.length) {
                cnt++;
            }
        }

        return cnt;
    }
}
