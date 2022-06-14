public class Flight {
    private String departure, arrival;
    private int day, flightId, boxes;
    Flight(int flightId, String departure, String arrival, int day){
        this.flightId = flightId;
        this.departure = departure;
        this.arrival = arrival;
        this.day = day;
        this.boxes = 0;
    }

    public void setFlightId(int flightId){
        this.flightId = flightId;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setArrival(String arrival){
        this.arrival = arrival;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void addBox(){
        this.boxes ++;
    }

    public int getFlightId(){
        return this.flightId;
    }

    public String getDeparture(){
        return this.departure;
    }

    public String getArrival() {
        return this.arrival;
    }

    public int getDay(){
        return this.day;
    }

    public int getBoxes(){
        return this.boxes;
    }
}

