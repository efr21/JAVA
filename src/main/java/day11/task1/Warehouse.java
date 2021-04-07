package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void increase_CountPickedOrders() {
        countPickedOrders++;
    }

    public void increase_CountDeliveredOrders() {
        countDeliveredOrders++;
    }





    public String toString() {
        return "количество собранных заказов: " + countPickedOrders +
                ", количество доставленных заказов: " + countDeliveredOrders;
    }

}
