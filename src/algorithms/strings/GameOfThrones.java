package algorithms.strings;

import java.util.Scanner;

/**
 * Created by Monil on 3/19/16.
 *
 * Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

 door

 But, to lock the door he needs a key that is an anagram of a certain palindrome string.

 The king has a string composed of lowercase English letters. Help him figure out whether any anagram of the string can be a palindrome or not.

 Input Format
 A single line which contains the input string.

 Constraints
 1≤1≤ length of string ≤105≤105
 Each character of the string is a lowercase English letter.

 Output Format
 A single line which contains YES or NO in uppercase.

 Sample Input : 01

 aaabbbb
 Sample Output : 01

 YES
 Explanation
 A palindrome permutation of the given string is bbaaabb.

 Sample Input : 02

 cdefghmnopqrstuvw
 Sample Output : 02

 NO
 Explanation
 You can verify that the given string has no palindrome permutation.

 Sample Input : 03

 cdcdcdcdeeeef
 Sample Output : 03

 YES
 Explanation
 A palindrome permutation of the given string is ddcceefeeccdd.
 *
 *
 */
public class GameOfThrones {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        System.out.println(canBePalindrome(inputString));
        myScan.close();
    }

    private static String canBePalindrome(String inputString) {
        boolean[] alphabets = new boolean[26];

        for(int i=0; i<inputString.length(); i++) {
            alphabets[inputString.charAt(i) - 'a'] = !alphabets[inputString.charAt(i) - 'a'];
        }

        int trueCnt = 0;

        for(int i=0; i<26; i++) {
            if(alphabets[i]) {
                trueCnt++;
                if (trueCnt > 1)
                    break;
            }
        }

        if(trueCnt > 1)
            return "NO";

        return "YES";
    }
}
