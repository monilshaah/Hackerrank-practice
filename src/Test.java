/**
 * Created by Monil on 3/17/16.
 */
public class Test {
    public static void main(String[] args) {
        int i = 100000000;
        int j = 100000000;

        long sqr = (long)(i * i);
        System.out.println(sqr);

        long sum = sqr + i;
        System.out.println(sum);

        long sum2 = sum + 2;
        System.out.println(sum2);

        long temp = sum2/2;
        System.out.println(temp);

        if(temp >= 1000000000)
            temp = temp % 1000000000;

//        long mod = temp % 1000000000;
        int val = Integer.parseInt(Long.valueOf(temp).toString());



        int modInt = (int)temp % 1000000000;

        System.out.println(temp);
        System.out.println(val);
        System.out.println(modInt);


        sqr += i + 2;
        sqr /= 2;

        if(sqr >= 1000000000)
            sqr = sqr % 1000000000;

        System.out.println("sqr = " + sqr);
    }
}
