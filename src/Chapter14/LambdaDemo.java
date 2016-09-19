package Chapter14;

/**
 * Created by KSM on 2016/9/1.
 */
interface MyValue{
    double getValue();
}

interface MyParaValue{
    double getValue(double v);
}
public class LambdaDemo {
    public static void main(String args[]){
        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println("A constant value: " + myVal.getValue());

        MyParaValue myPval = (n) -> 1.0/n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8));
    }
}
