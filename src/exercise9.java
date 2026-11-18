import java.util.List;
import java.util.ArrayList;

public class exercise9 {
    public static void main (String[] args){
        List<Transport> transport = new ArrayList<>();
    
        transport.add(new BusTransport(15));
        transport.add(new MetroTransport(30));
        transport.add(new TaxiTransport(150));

        for(Transport t : transport){
            t.display_fare();
        }
    }
}

abstract class Transport {
    protected double distance;

    Transport(double distance){
        this.distance = distance;
    }

    abstract public double calculate_fare();
    abstract public void display_fare();
}

class BusTransport extends Transport{
    BusTransport(double distance){
        super(distance);
    }

    public double calculate_fare(){
        return distance * 1.5;
    }

    public void display_fare(){
        System.out.printf("The fare for bus transport is: %.2f.\n", calculate_fare());
    }
}

class MetroTransport extends Transport{
    MetroTransport(double distance){
        super(distance);
    }

    public double calculate_fare(){
        return 10 + (distance*2);
    }

    public void display_fare(){
        System.out.printf("The fare for metro transport is: %.2f.\n", calculate_fare());
    }
}

class TaxiTransport extends Transport{
    TaxiTransport(double distance){
        super(distance);
    }

    public double calculate_fare(){
        return 20 + (distance * 5);
    }

    public void display_fare(){
        System.out.printf("The fare for taxi transport is: %.2f.\n", calculate_fare());
    }

}