public class Order {
    private String orderNum;
    private Flight flight;
    Order(String orderNum){
        this.orderNum = orderNum;
        this.flight = null;
    }
    Order(String orderNum, Flight flightNum){
        this.orderNum = orderNum;
        this.flight = flightNum;
    }

    public void setOrderNum(String orderNum){
        this.orderNum = orderNum;
    }

    public void setFlight(Flight flightNum){
        this.flight = flightNum;
    }

    public String  getOrderNum(){
        return this.orderNum;
    }

    public Flight getFlight(){
        return this.flight;
    }
}
