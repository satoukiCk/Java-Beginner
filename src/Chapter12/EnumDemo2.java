package Chapter12;
/**
 * Created by KSM on 2016/8/31.
 */
public class EnumDemo2 {
    public static void main(String args[]){
        Transport tp;

        System.out.println("Here are all transport constants");

        Transport allTransports[] = Transport.values();
        for(Transport t: allTransports){
            System.out.println(t);
        }
        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains "  + tp);
    }

}
