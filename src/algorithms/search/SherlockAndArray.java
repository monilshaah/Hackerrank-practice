package algorithms.search;

import java.util.Scanner;

/**
 * Created by Monil on 3/19/16.
 *
 * Watson gives Sherlock an array AA of length NN. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
 Formally, find an ii, such that, AA1+A+A2...A...Ai-1 =A=Ai+1+A+Ai+2...A...AN.

 Input Format
 The first line contains TT, the number of test cases. For each test case, the first line contains NN, the number of elements in the array AA. The second line for each test case contains NN space-separated integers, denoting the array AA.

 Output Format
 For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

 Constraints
 1≤T≤101≤T≤10
 1≤N≤1051≤N≤105
 1≤A1≤Ai ≤2×104≤2×104
 1≤i≤N1≤i≤N
 Sample Input

 2
 3
 1 2 3
 4
 1 2 3 3
 Sample Output

 NO
 YES
 Explanation
 For the first test case, no such index exists.
 For the second test case, A[1]+A[2]=A[4]A[1]+A[2]=A[4], therefore index 33 satisfies the given conditions.
 *
 *
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int[] arr;
        for(int i = 0; i < tests; i++) {
            int size = sc.nextInt();
            arr = new int[size];
            for(int idx = 0; idx < size; idx++) {
                arr[idx] = sc.nextInt();
            }
            System.out.println(exists(arr));
        }
    }

    private static String exists(int[] arr) {
        if(arr.length == 1) {
            return "YES";
        }

        int total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int leftSum = 0, rightSum = total - arr[0], currentItem = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (leftSum == rightSum) {
                System.out.println(leftSum + "::" + rightSum + "::" + currentItem);
                return "YES";
            }

            leftSum += currentItem;
            currentItem = arr[i];
            rightSum -= currentItem;
        }

        return "NO";
    }
}
