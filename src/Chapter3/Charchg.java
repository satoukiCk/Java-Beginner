package Chapter3;

/**
 * Created by KSM on 2016/8/3.
 */
public class Charchg {
    public static void main(String args[])
    throws java.io.IOException{
        char ch;
        int changes = 0;
        System.out.print("Enter:");
        do{
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z'){
                ch -= 32;changes++;}
            else if (ch >='A' & ch <= 'Z'){
                ch+=32;changes++;}
            System.out.print(ch);
        }while(ch!='.');
        System.out.println("\nNumber of Changes:" + changes);

    }
}
