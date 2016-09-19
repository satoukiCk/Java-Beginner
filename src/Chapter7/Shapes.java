package Chapter7;

/**
 * Created by KSM on 2016/8/27.
 */
class TwoDShape{
    double width;
    double height;

    TwoDShape(double w, double h)
    {
        width = w;
        height = h;
    }

    TwoDShape(){
        width = height = 0;
    }
    TwoDShape(double x){
        width = height = x;
    }
    void ShowDim(){
        System.out.println("Width and height are:" + width + "and" + height);
    }
}

class Triangle extends TwoDShape{
    String style;

    Triangle(String s,double w,double h)
    {
        super(w,h);
        style = s;
    }

    Triangle()
    {
        super();
        style = "none";
    }

    Triangle(double x){
        super(x);
        style = "filled";

    }

    double area(){
        return width * height / 2;
    }

    void Showstyle(){
        System.out.println("Triangle is: " + style);
    }
}
public class Shapes {
    public static void main(String args[]){
        Triangle t1 = new Triangle("filled",4,4);
        Triangle t2 = new Triangle("outlined",5,5);


        System.out.println("INTO FOR T1:"  );
        t1.Showstyle();
        t1.ShowDim();
        System.out.println("Area is:" + t2.area());
    }
}
