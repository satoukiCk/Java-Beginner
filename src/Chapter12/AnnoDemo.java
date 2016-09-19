package Chapter12;

/**
 * Created by KSM on 2016/8/31.
 */
@Deprecated
class MyClass{
    private String msg;

    MyClass(String m){
        msg = m;
    }
    @Deprecated
    String getMsg(){
        return msg;
    }
}
public class AnnoDemo {
    public static void main(String args[]) {
        MyClass myObj = new MyClass("test");
        System.out.println(myObj.getMsg());
    }
}
