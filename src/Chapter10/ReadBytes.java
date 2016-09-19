package Chapter10;
import java.io.*;
/**
 * Created by KSM on 2016/8/30.
 */
public class ReadBytes {
    public static void main(String args[])
        throws IOException{
            byte data[] = new byte[10];

            System.out.println("Enter some characters.");
            System.in.read(data);
            System.out.print("Entered: ");
            for (int i = 0;i<data.length;i++){
                System.out.print((char) data[i]);
            }
        }

}
