package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
interface StringTest{
    boolean test(String a,String b);
}
public class LamDemo3 {
    public static void main(String args[]){
        StringTest isIn = (a,b) -> a.indexOf(b) != -1;

        String str = "This is a test";

        if(isIn.test(str,"is a"))
            System.out.println("'is a' is found");
        else
            System.out.println("not found");

        if(!isIn.test(str,"xuz"))
            System.out.println("'xuz' is not found");
        else
            System.out.println("'xuz' is found" );
    }
}
