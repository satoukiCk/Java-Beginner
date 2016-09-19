package Chapter12;

/**
 * Created by KSM on 2016/8/31.
 */
public class EnumDemo3 {
    public static void main(String args[]){
        Transport tp;
        System.out.println("airplane speed is " + Transport.AIRPLANE.getSpeed());

        System.out.println("all Transport speed:");
        for (Transport t: Transport.values()){
            System.out.println(t + "speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}
