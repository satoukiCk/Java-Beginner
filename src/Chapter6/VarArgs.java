package Chapter6;

/**
 * Created by KSM on 2016/8/26.
 */
public class VarArgs {
    static void vaTest(int ... v){
        System.out.println("Number of args:" + v.length);
        System.out.println("Contents: ");

        for(int i = 0 ;i< v.length;i++)
        {
                System.out.println("arg " + i + ": " + v[i]);
        }
    }
    public static void main(String args[]){
        vaTest(10);
        vaTest(10,20,30,40);
        vaTest();
    }
}
