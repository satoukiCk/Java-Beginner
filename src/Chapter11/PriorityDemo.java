package Chapter11;

/**
 * Created by KSM on 2016/8/30.
 */
class Priority implements Runnable{
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    Priority(String name){
        thrd = new Thread(this,name);
        count = 0;
        currentName = name;
    }

    public void run(){
        System.out.println(thrd.getName() + "starting.");
        do{
            count++;

            if(currentName.compareTo(thrd.getName())!=0){
                currentName = thrd.getName();
                System.out.println("In" + currentName);
            }
        }while(stop == false && count < 1000000);
        stop = true;
    }
}
public class PriorityDemo {
    public static void main(String args[]){
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt1.thrd.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thrd.start();
        mt2.thrd.start();

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread interrupted ");
        }
        System.out.println("\nHigh priority thread counted to " +
                mt1.count);
        System.out.println("Low priority thread counted to " +
                mt2.count);
    }
}
