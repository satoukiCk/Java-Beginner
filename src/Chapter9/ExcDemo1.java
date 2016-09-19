package Chapter9;

/**
 * Created by KSM on 2016/8/29.
 */
public class ExcDemo1 {
    public static void main(String args[]){
        int nums[] = new int[4];
        try {
            System.out.println("Before exception i generated" );

            nums[7] = 10;
            System.out.println("This won't be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
