public class PrintOrder {
    public static String toString(Order order){
        return "order: "+order.getOrderNum()+", flightNumber: "+order.getFlight().getFlightId()+PrintFlight.printWithoutFlightId(order.getFlight());
    }
}
