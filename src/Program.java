
import Clients.BaseClient;
import Clients.ClientType1;
import Inputers.ConsoleInputer;
import Orders.Order;
import Products.BaseProduct;

public class Program {
    public static void main(String[] args) {
        ConsoleInputer inputer = new ConsoleInputer("Введите");
        BaseClient client = ClientType1.create(inputer.prompt("имя клиента"));
        BaseProduct product = ProductType1.create(inputer.prompt("имя продукта"));

        Order order = new Order(
                client,
                product,
                Integer.parseInt(inputer.prompt("количество")),
                Integer.parseInt(inputer.prompt("стоимость")));

        System.out.println(order);
    }
}
