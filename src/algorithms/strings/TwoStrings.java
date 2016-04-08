package algorithms.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-strings
 */

public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tests; i++) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(checkForSubstrings(str1, str2));
        }
    }

    public static String checkForSubstrings(String str1, String str2) {
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < str1.length(); i++) {
            if(!alphabets[str1.charAt(i)-'a']) {
                alphabets[str1.charAt(i)-'a'] = !alphabets[str1.charAt(i)-'a'];
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if(alphabets[str2.charAt(i)-'a']) {
                //System.out.println("YES");
                return "YES";
            }
        }

//        System.out.println("NO");
        return "NO";
    }

}

