

import java.util.Scanner;

public class Beast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            getLargestDecentNumber(n);
        }
    }

    public static void getLargestDecentNumber(int digitSize) {
        String decentNum = "";

        int rem = digitSize % 3;

        if (rem == 0) {
            System.out.println(String.format("%0" + digitSize + "d", 0).replace("0","5"));
        } else if(rem == 1) {
            String threes = String.format("%0" + 5 + "d", 0).replace("0","3");
            String fives = String.format("%0" + (digitSize - 5) + "d", 0).replace("0","5");
            System.out.println(fives + threes);
        } else {
            String threes = String.format("%0" + 10 + "d", 0).replace("0","3");
            String fives = String.format("%0" + (digitSize - 10) + "d", 0).replace("0","5");
            System.out.println(fives + threes);
        }

    }
}
