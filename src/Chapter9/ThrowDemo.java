package Chapter9;

/**
 * Created by KSM on 2016/8/29.
 */
public class ThrowDemo {
    public static void main(String args[]){
        try{
            System.out.println("before throw.");
            throw new ArithmeticException("this is ArithmeticException");
        }
        catch(ArithmeticException exc){
            System.out.println("throw caught");
        }
        System.out.println("After try/catch block.");
    }
}
