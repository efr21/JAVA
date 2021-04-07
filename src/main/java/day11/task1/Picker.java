package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;

    Warehouse warehouse = new Warehouse();

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Picker (Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "зп работника: " + salary + ", бонус начислен: " + isPayed;
    }

    public void doWork() {
        salary += 80;
        warehouse.increase_CountPickedOrders();
    }

    public void bonus() {
        if ((warehouse.getCountPickedOrders() == 10000) && (!isPayed)) {
            salary += 70000;
            isPayed = false;
        } else if (warehouse.getCountPickedOrders() >= 10000) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

}
