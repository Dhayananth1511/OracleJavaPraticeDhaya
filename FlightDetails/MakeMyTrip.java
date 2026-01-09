import java.util.List;

public class MakeMyTrip {
    public static void main(String[] args) {
        AirIndia flight=new AirIndia();
        List<Flight> details=flight.setter();
        System.out.println(details);
    }
}
