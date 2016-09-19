package Chapter12;

/**
 * Created by KSM on 2016/8/31.
 */
enum Transport{
    CAR(65),TRUCK(55),AIRPLANE(600),TRAIN(70),BOAT(22);

    private int speed;
    Transport(int s){ speed =s;}
    int getSpeed() {return speed;}


}
public class EnumDemo {
    public static void main(String args[]){
        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println("Value of tp:" + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp contains train.\n");

        switch (tp){
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
