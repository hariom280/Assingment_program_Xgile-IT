/**
 * Association : Association is a relation between two separate classes that establishes with the help of their Objects.
 * */
//class bus
class Bus{
    private String name;
    // bus name
    Bus(String name){
        this.name = name;
    }
    public String getBusName(){
        return this.name;
    }
}

//passenger class
class Passenger{
    // passenger name
    private String name;
    // passenger seat id number
    private int seatId;
    Passenger(String name, int seatId){
        this.name = name;
        this.seatId = seatId;
    }
    public String getPassengerName(){
        return this.name;
    }
    public int getPassengerId(){
        return this.seatId;
    }
}

//Association between both the
//classes in the main method
public class Example_Of_Association {
    public static void main(String[] args) {
        Bus bus=new Bus("John Travels");
        Passenger psg = new Passenger("John", 32);

        System.out.println(psg.getPassengerName()+ " With Seat No. " + psg.getPassengerId() + " is a passenger of " + bus.getBusName());
    }
}
