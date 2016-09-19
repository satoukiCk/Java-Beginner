package Chapter8;

/**
 * Created by KSM on 2016/8/28.
 */
interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

class Myclass implements B{
    public void meth1(){
        System.out.println("1");
    }
    public void meth2(){
        System.out.println("2");
    }
    public void meth3(){
        System.out.println("3");
    }
}
public class IFExtend {
    public static void main(String args[]){
        Myclass ob = new Myclass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
