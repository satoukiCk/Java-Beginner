package Chapter2;

/**
 * Created by KSM on 2016/7/13.
 */
public class LogicalOpTable {
    public static void main(String arcs[]){
       boolean p,q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;q=true;
        if (p==true)
            System.out.print("1\t");
        else
            System.out.print("0\t");

        if (q=true)
            System.out.print("1\t");
        else
            System.out.print("0\t");

        if (p&q==true)
            System.out.print("1\t");
        else
            System.out.print("0\t");

        if (p|q==true)
            System.out.print("1\t");
        else
            System.out.print("0\t");

        if (p^q==true)
            System.out.print("1\t");
        else
            System.out.print("0\t");

        if (!p==true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
