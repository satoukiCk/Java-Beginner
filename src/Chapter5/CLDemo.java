package Chapter5;

/**
 * Created by KSM on 2016/8/25.
 */
public class CLDemo {
    public static void main(String args[]){
        System.out.println("There are" + args.length + " command-line arguments");
        System.out.println("They are:");
        for (int i = 0 ; i< args.length ; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
