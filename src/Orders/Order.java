package Orders;

import Clients.BaseClient;
import Products.BaseProduct;

public class Order {

    private BaseClient client;
    private BaseProduct product;
    private int qnt;
    private int price;

    public Order(BaseClient client, BaseProduct product, int qnt, int price) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public BaseClient getClient() {
        return client;
    }

    public BaseProduct getProduct() {
        return product;
    }
}
