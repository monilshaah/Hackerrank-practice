package algorithms.strings;

/**
 * Created by Monil on 3/27/16.
 */
public class BearAndSteadyGene {
    public static void main(String[] args) {
        getSteadyGeneCount("gaaataaa",8);
    }

    static int getSteadyGeneCount(String seq, int length) {
        int[] charCnt = new int[26];

        int need = length/4;


        for(char c: seq.toCharArray()) {
            charCnt[c-'a'] += 1;
        }

        if(charCnt['a'-'a'] == need && charCnt['c'-'a'] == need &&
                charCnt['t'-'a'] == need && charCnt['g'-'a'] == need)
            return 0;

        int max = 0, maxCharIdx=0;
        for(int i=0; i<26; i++) {
            if(charCnt[i] > max) {
                max = charCnt[i];
                maxCharIdx = i;
            }
        }

        char maxChar = (char) (maxCharIdx + 'a');

        int[] temp = charCnt.clone();

//        int start=0, end=0, maxCharCntWindow = 0, maxExtra = max-2;
//
//        if(seq.charAt(0) == maxChar) {
//            maxCharCntWindow++;
//        }
//
//        while(end < length && end >= start) {
//            if(maxCharCntWindow < maxExtra) {
//                end++;
//                if(seq.charAt(end) == maxChar) {
//                    maxCharCntWindow++;
//                    System.out.println(end+"::"+maxCharCntWindow);
//                }
//                continue;
//            }
//
//            if(seq.charAt(start) != maxChar) {
//                start++;
//                continue;
//            }
//
//
//        }
//
//        System.out.println(start + "::" + end);

        int aCnt=charCnt['a'-'a'] > need? charCnt['a'-'a'] - need : 0;
        int cCnt=charCnt['c'-'a'] > need? charCnt['c'-'a'] - need : 0;
        int tCnt=charCnt['t'-'a'] > need? charCnt['t'-'a'] - need : 0;
        int gCnt=charCnt['g'-'a'] > need? charCnt['g'-'a'] - need : 0;


        int low = 0, high = max-1;

        while(low < high) {
            //check for char counts
            if ((length - ))
        }

        return 0;
    }
}
