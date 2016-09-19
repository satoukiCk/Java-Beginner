package Chapter2;

/**
 * Created by KSM on 2016/7/9.
 */
public class SCops {
    public static void main(String arcs[]) {
        int n = 10, d = 2;
        if (d != 0 && (n % d == 0))
            System.out.println(d + " is a factor of " + n);
        d = 0;
        if (d != 0 && (n % d == 0))
            System.out.println(d + " is now a factor of " + n);

    }
}
