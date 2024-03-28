
import Clients.BaseClient;
import Clients.ClientType1;
import Inputers.ConsoleInputer;
import Products.BaseProduct;

public class Program {
    public static void main(String[] args) {
        ConsoleInputer inputer = new ConsoleInputer();
        BaseClient client = ClientType1.create(inputer.prompt("имя клиента: "));
        BaseProduct product = BaseProduct.ProductType1.create(inputer.prompt("имя продукта: "));

        Order order = new Order(
                client,
                product,
                Integer.parseInt(inputer.prompt("количество: ")),
                Integer.parseInt(inputer.prompt("стоимость: ")));

    }
}
