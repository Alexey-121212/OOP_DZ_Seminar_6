
import Clients.ClientType1;
import OrderInputers.OrderInputerConsole1;
import Products.ProductType1;

public class Program {
    public static void main(String[] args) {
//        System.out.println("Введите заказ:");
//        Order order = new Order("", "", 0, 0);
//        order.inputFromConsole();
//        order.saveToJson();

        Order order = new Order(new OrderInputerConsole1());

    }
}
