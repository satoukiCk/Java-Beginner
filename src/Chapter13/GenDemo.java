package Chapter13;

/**
 * Created by KSM on 2016/9/1.
 */
class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String args[]){
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value:" + v);

        System.out.println();
    }
}
