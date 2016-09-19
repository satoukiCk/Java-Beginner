package Chapter7;

/**
 * Created by KSM on 2016/8/27.
 */
class AA{
    AA(){
        System.out.println("A");
    }
}
class BB extends AA{
    BB()
    {
        System.out.println("B");
    }
}
class CC extends BB{
    CC(){
        System.out.println("C");
    }
}
public class OrderOfCon {
    public static void main(String args[]){
        CC example = new CC();
    }
   ;

}
