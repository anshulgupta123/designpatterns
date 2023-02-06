import com.anaplan.factorydesignpatterns.Constants;
import com.anaplan.factorydesignpatterns.Transport;
import com.anaplan.factorydesignpatterns.TransportFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter location");
        String location=scanner.next();
        TransportFactory transportFactory= new TransportFactory();
        if(location.equalsIgnoreCase("USA")){
            Transport transport= transportFactory.getTransport(Constants.SHIP);
            transport.deliver();
        }
        if(location.equalsIgnoreCase("Jaipur")){
            Transport transport= transportFactory.getTransport(Constants.TRUCK);
             transport.deliver();
        }
        System.out.println("Cannot deliver to this location");

    }
}