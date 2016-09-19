package Chapter3;

/**
 * Created by KSM on 2016/7/13.
 */
public class ForTest {
    public static void main(String arcs[])
        throws java.io.IOException{
        int i;
        System.out.println("Press s to stop!");

        for (i=0;(char) System.in.read()!='s';i++)
            System.out.println("Pass #" + i);
    }
}
