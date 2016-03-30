package algorithms.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Monil on 3/15/16.
 *
 * Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set (and frequency of characters) and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

 Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

 Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

 Input Format
 Two lines each containing a string.

 Constraints
 1 <= Length of A,B <= 10000
 A and B will only consist of lowercase latin letter.

 Output Format
 A single integer which is the number of character deletions.

 Sample Input #00:

 cde
 abc
 Sample Output #00:

 4
 Explanation #00:
 We need to delete 4 characters to make both strings anagram i.e. 'd' and 'e' from first string and 'b' and 'a' from second string.
 */
public class MakeAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(deletionCountForAnagram(str1, str2));
    }

//    private static int getCount(String str) {
//
//    }

    private static int deletionCountForAnagram(String str1, String str2) {
        int cnt = 0;

        HashMap<Character, Integer> charMap1 = new HashMap<Character, Integer>();

        for(char ch : str1.toCharArray()) {
            if (charMap1.containsKey(ch)) {
                charMap1.put(ch, charMap1.get(ch) + 1);
            } else {
                charMap1.put(ch, 1);
            }
        }

        HashMap<Character, Integer> charMap2 = new HashMap<Character, Integer>();

        for(char ch : str2.toCharArray()) {
            if (charMap1.containsKey(ch) && charMap1.get(ch) != 0) {
                charMap1.put(ch, charMap1.get(ch) - 1);
            } else if (charMap2.containsKey(ch)) {
                charMap2.put(ch, charMap2.get(ch) + 1);
            } else {
                charMap2.put(ch, 1);
            }
        }

        for(Integer val : charMap1.values()) {
            cnt += val;
        }

        for(Integer val : charMap2.values()) {
            cnt += val;
        }

        return cnt;
    }
}
