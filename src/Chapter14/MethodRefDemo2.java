package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
class MyIntNum{
    private int v;
    MyIntNum(int x){
        v = x;
    }

    int getNum()
    {
        return v;
    }

    boolean isFactor(int n){
        return (v%n) == 0;
    }
}
public class MethodRefDemo2 {
    public static void main(String args[]){
        boolean result;

        MyIntNum myNum = new MyIntNum(12);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if(result)
            System.out.println("3 is a factor of 12");

    }
}
