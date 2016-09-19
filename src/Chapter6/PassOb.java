package Chapter6;

/**
 * Created by KSM on 2016/8/26.
 */
class Block{
    int a,b,c,volume;

    Block(int i , int j , int k){
        a = i;b = j; c=k;
        volume = a*b*c;
    }
    boolean sameBlock(Block ob)
    {
        if((a == ob.a) & (b == ob.b) & (c==ob.c)) return true;
        else return false;
    }
    boolean sameVolume(Block ob)
    {
        return ob.volume == volume;
    }
}
public class PassOb {
    public static void main(String args[]){
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(4,5,5);

        System.out.println("ob1 same dimensions as ob2:" + ob1.sameBlock(ob2) );
    }
}
