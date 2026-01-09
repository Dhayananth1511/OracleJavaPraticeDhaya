public class Flight {
    String name;
    String source;
    String destination;
    Flight(String name,String source,String destination)
    {
        this.name=name;
        this.source=source;
        this.destination=destination;
    }
    public String toString()
    {
         return name+" "+source+" "+destination;
    }
}
