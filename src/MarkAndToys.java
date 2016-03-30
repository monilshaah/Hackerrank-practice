import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Monil on 3/16/16.
 */
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        // Compute the final answer from n,k,prices
        System.out.println(getMaxToysCnt(prices, k));
    }

    private static int getMaxToysCnt(int[] prices, int k) {
        Arrays.sort(prices);
        int cnt = 0, i = 0;
        while(true) {
            if (k - prices[i] < 0) {
                break;
            }
            k -= prices[i];
            i++;
            cnt++;
        }

        return cnt;
    }
}
