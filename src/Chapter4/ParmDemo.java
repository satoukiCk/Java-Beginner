package Chapter4;

/**
 * Created by KSM on 2016/8/16.
 */
class ChkNum{
    boolean isEven(int x){
        if(x%2==0) return true;
        else return false;
    }
}
public class ParmDemo {
    public static void main(String args[]){
        ChkNum e = new ChkNum();
        if(e.isEven(10)) System.out.println("10 is even");
    }
}


