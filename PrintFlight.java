public class PrintFlight {

    public static String printWithoutFlightId(Flight flight){
        return ", departure: "+flight.getDeparture()+", arrival: "+flight.getArrival()+", day: "+flight.getDay();
    }

    public static String toString(Flight flight){
        return "Flight: "+flight.getFlightId()+", departure: "+flight.getDeparture()+", arrival: "+flight.getArrival()+", day: "+flight.getDay();
    }
}
