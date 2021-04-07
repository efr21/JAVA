package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;

    Warehouse warehouse = new Warehouse();

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "зп курьера: " + salary + ", бонус начислен: " + isPayed;
    }

    public void doWork() {
        salary += 100;
        warehouse.increase_CountDeliveredOrders();
    }

    public void bonus() {
        if ((warehouse.getCountDeliveredOrders() == 10000) && (!isPayed)) {
            salary += 50000;
            isPayed = true;
        } else if (warehouse.getCountDeliveredOrders() >= 10000) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
