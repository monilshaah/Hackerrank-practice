import java.util.Arrays;

/**
 * Created by Monil on 3/27/16.
 */
public class Candies {

    public static void main(String[] args) {
//        int[] ratings = {1,2,2};
        int[] ratings = {2,4,2,6,1,7,8,9,2,1};
        System.out.println(candyCount(ratings));
    }

    public static int candyCount(int[] ratings) {
        
        if (ratings == null)
            return 0;

        int[] candies = new int[ratings.length];

        candies[0] = 1;

        for(int i=1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            } else {
                candies[i] = 1;
            }
        }

        System.out.println(Arrays.toString(candies));

        for(int i=ratings.length-1; i > 0; i--) {
            if(ratings[i-1] > ratings[i]) {
                candies[i-1] = Math.max(candies[i-1], candies[i] + 1);
            }
        }

        int cnt = 0;

        for(int i = 0; i < candies.length; i++) {
            cnt += candies[i];
        }

        System.out.println(Arrays.toString(candies));
        return cnt;
    }
}
