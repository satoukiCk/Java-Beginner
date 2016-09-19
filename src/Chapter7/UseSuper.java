package Chapter7;

/**
 * Created by KSM on 2016/8/27.
 */

class A{
    int i;
}
class B extends A{
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show()
    {
        System.out.println("super: " + super.i + " sub: " + i);
    }
}
public class UseSuper {
    public static void main(String args[])
    {
        B sample = new B(2,3);
        sample.show();
    }

}
