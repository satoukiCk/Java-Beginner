package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
interface IntPredicate{
    boolean test(int n);
}

class MyIntPredicate{
    static boolean isPrime(int n){
        if(n < 2) return false;

        for(int i = 2;i<=n/i;i++)
            if((n%i) == 0)
                return false;

        return true;
    }
    static boolean isEven(int n){ return (n%2) ==  0;}
    static boolean isPostive(int n ){return n>0;}

}

public class MethodRefDemo {
    static boolean numTest (IntPredicate p, int v){
        return p.test(v);
    }
    public static void main(String args[]){
        boolean result;

        result = numTest(MyIntPredicate::isPrime,17);
        if(result)
            System.out.println("17 is prime");

        result = numTest(MyIntPredicate::isEven,12);
        if(result)
            System.out.println("12 is even");

        result = numTest(MyIntPredicate::isPostive,2);
        if(result)
            System.out.println("2 is positive.");
    }

}

