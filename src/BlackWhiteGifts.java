import java.util.Scanner;

/**
 * Created by Monil on 3/15/16.
 *
 *
 * Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy BB number of black gifts and WW number of white gifts.

 The cost of each black gift is XX units.
 The cost of every white gift is YY units.
 The cost of converting each black gift into white gift or vice versa is ZZ units.
 Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

 Input Format

 The first line will contain an integer TT which will be the number of test cases.
 There will be TT pairs of lines. The first line of each test case will contain the values of integers BB and WW. Another line of each test case will contain the values of integers XX, YY, and ZZ.

 Constraints
 1≤T≤101≤T≤10
 0≤X,Y,Z,B,W≤1090≤X,Y,Z,B,W≤109
 Output Format

 TT lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.
 */
public class BlackWhiteGifts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            System.out.println(getMinPrice(b,w,x,y,z));
        }
    }

    private static long getMinPrice(long b, long w, long x, long y, long z) {
        if (x == y) { //black price equal to white => consider original price
            return (b * x + w * y);
        } else if (x < y) { //black price less white => consider original black price
            if (y <= (x + z)) {
                return (b * x + w * y);
            } else {
                return (b * x + w * (x + z));
            }
        } else {//white price less black => consider original white price
            if (x <= (y+z)) {
                //original black price is less
                return (b * x + w * y);
            } else {
                return (b * (y + z) + w * y);
            }
        }
    }
}
