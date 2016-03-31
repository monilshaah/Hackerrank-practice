package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/taum-and-bday
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
