package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
interface SomeTest<T>{
    Boolean test(T n,T m);
}
public class GenFuncInDemo {
    public static void main(String args[]){
        SomeTest<Integer> isFactor = (n,d) -> (n%d) == 0;

        if(isFactor.test(10,2))
            System.out.println("2 is a factor of 10");

        SomeTest<Double> isFactorD = (n,d) -> (n%d) == 0;
        if(isFactorD.test(212.0,4.0))
            System.out.println("4.0 is a factor of 212.0");

        System.out.println();
    }
}
