import java.util.ArrayList;
public class AirIndia {
    public ArrayList<Flight> setter()
    {
        ArrayList<Flight> a=new ArrayList<>();
        Flight f1=new Flight("AR123","Chennai","Madurai");
        Flight f2=new Flight("AR124", "Delhi", "Chennai");
        Flight f3=new Flight("AR125", "London", "Chennai");
        a.add(f1);
        a.add(f2);
        a.add(f3);
        return a;
    }
    }
