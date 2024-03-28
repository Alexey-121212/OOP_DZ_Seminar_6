package Orders;

import Clients.BaseClient;
import Products.BaseProduct;

public class Order {

    private int qnt;
    private int price;

    private BaseClient client;
    private BaseProduct product;

    public Order(BaseClient client, BaseProduct product, int qnt, int price) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public BaseClient getClient() {
        return client;
    }

    public BaseProduct getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Orders.Order{" +
                "qnt=" + qnt +
                ", price=" + price +
                ", client=" + client.getName() +
                ", product=" + product.getName() +
                '}';
    }
}
