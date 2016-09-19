package Chapter5;

/**
 * Created by KSM on 2016/8/25.
 */
public class ArrayDemo {
    public static void main(String args[]){
        int sample[] = new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            sample[i] = i;
        }
        for(i = 0 ; i < 10 ; i++){
            System.out.println("This is sample[" + i + "]:" + i);
        }
    }
}
