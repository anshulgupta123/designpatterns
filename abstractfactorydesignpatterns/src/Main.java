import com.anaplan.abstractfactorydesignpatterns.factories.AbstractTransport;
import com.anaplan.abstractfactorydesignpatterns.factories.FactoryProducer;
import com.anaplan.abstractfactorydesignpatterns.transport.Transport;
import com.anaplan.abstractfactorydesignpatterns.utility.Constants;

public class Main {
    public static void main(String[] args) {
        AbstractTransport waterTransport = FactoryProducer.getFactory(true);
        Transport bigShipTransport = waterTransport.getTransport(Constants.BIG_SHIP);
        bigShipTransport.deliver();
        Transport smallShipTransport1 = waterTransport.getTransport(Constants.SMALL_SHIP);
        smallShipTransport1.deliver();
        AbstractTransport landTransport = FactoryProducer.getFactory(false);
        Transport bigTruckTransport = landTransport.getTransport(Constants.BIG_TRUCK);
        bigTruckTransport.deliver();
        Transport smallTruckTransport = landTransport.getTransport(Constants.SMALL_TRUCK);
        smallTruckTransport.deliver();
    }
}