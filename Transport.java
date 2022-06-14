import org.json.simple.JSONObject;

import java.util.*;

public class Transport {

    public static List<Flight> getFlights(){
        List<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight(1, "YUL", "YYZ", 1);
        Flight flight2 = new Flight(2, "YUL", "YYC", 1);
        Flight flight3 = new Flight(3, "YUL", "YVR", 1);
        Flight flight4 = new Flight(4, "YUL", "YYZ", 2);
        Flight flight5 = new Flight(5, "YUL", "YYC", 2);
        Flight flight6 = new Flight(6, "YUL", "YVR", 2);
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        return flights;
    }

    public static void main(String[] args){
        List<Flight> flights = Transport.getFlights();
        List<Order> orders = new ArrayList<>();

        for (Flight flight:flights) {
            System.out.println(PrintFlight.toString(flight));
        }

        JSONObject jsonObject = LoadJSON.load("coding-assigment-orders.json");
        Map<String, String> ordersMap = LoadJSON.loadOrders(jsonObject);
        SortedSet<String> keys = new TreeSet<>(ordersMap.keySet());
        boolean isAdded;

        for (String orderId: keys) {
            isAdded = false;
            for (Flight flight: flights) {
                if(ordersMap.get(orderId).equals(flight.getArrival())){
                    if(flight.getBoxes() < 20){
                        flight.addBox();
                        orders.add(new Order(orderId, flight));
                        isAdded = true;
                        break;
                    }
                }
            }
            if(!isAdded){
                orders.add(new Order(orderId));
            }
        }

        for (Order order: orders) {
            if(order.getFlight() == null){
                System.out.println("order: "+order.getOrderNum()+", flightNumber: not scheduled");
            }else{
                System.out.println(PrintOrder.toString(order));
            }
        }

    }
}
