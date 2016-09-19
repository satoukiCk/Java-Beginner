package Chapter3;

/**
 * Created by KSM on 2016/7/13.
 */
public class Guess {
    public static void main(String arcs[])
        throws java.io.IOException{
        char a; char answer='K';
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.print("Can you guess it: ");
        a = (char) System.in.read();
        if ( a == answer)
            System.out.println("** Right **");
        else {
            System.out.print("WRONG! ");
            if (a < answer)
                System.out.println("too low!");
            else
                System.out.println("too high");
        }
    }
}
