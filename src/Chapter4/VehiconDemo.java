package Chapter4;

/**
 * Created by KSM on 2016/8/25.
 */
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p,int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    int range()
    {
        return fuelcap * mpg;
    }
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class VehiconDemo {
    public static void main (String args[]){
        Vehicle minivan  = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " mile minivan needs " + gallons + "gallons of fuel.");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " sportscar needs " + gallons + " gallons of fuel.");
    }
}
