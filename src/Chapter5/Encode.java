package Chapter5;

/**
 * Created by KSM on 2016/8/25.
 */
public class Encode {
    public static void main(String args[]){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.println("The original message: " + msg);

        for (int i = 0 ; i < msg.length();i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("The encoded mesaage: " + encmsg);

        for (int i = 0 ; i < msg.length();i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("The decoded mesaage: " + decmsg);
    }
}
