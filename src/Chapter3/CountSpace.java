package Chapter3;

/**
 * Created by KSM on 2016/8/3.
 */
public class CountSpace {
    public static void main(String args[])
    throws java.io.IOException{
        int space = 0;
        char ch;
        System.out.print("Enter:");
        do{
            ch = (char) System.in.read();
            if(ch == ' ') space++;
        }while(ch!='.');
        System.out.println("Number of space: " + space);
    }
}
