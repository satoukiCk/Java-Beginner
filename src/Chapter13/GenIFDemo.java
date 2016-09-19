package Chapter13;

/**
 * Created by KSM on 2016/9/1.
 */
interface Containment<T>{
    boolean contains(T o);
}
class Myclass<T> implements Containment<T>{
    T[] arrayRef;

    Myclass(T[] o){
        arrayRef = o;
    }

    public boolean contains(T o){
        for(T x: arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}
public class GenIFDemo {
    public static void main(String args[]){
        Integer x[] = {1,2,3};

        Myclass<Integer> ob = new Myclass<Integer>(x);
        if(ob.contains(2)){
            System.out.println("2 in ob");
        }
        else
            System.out.println("2 not in ob");
    }
}
