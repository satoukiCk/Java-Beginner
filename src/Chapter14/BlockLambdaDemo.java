package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
interface NumberFunc{
    int func(int n);
}
public class BlockLambdaDemo {
    public static void main(String args[]) {
        NumberFunc smallestF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i <= n / i; i++)
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            return result;
        };
        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
    }
}
