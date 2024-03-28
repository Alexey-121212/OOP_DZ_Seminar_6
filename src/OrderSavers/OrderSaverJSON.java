package OrderSavers;

import Orders.Order;

import java.io.FileWriter;
import java.io.IOException;

public class OrderSaverJSON {
    private Order order;

    public OrderSaverJSON(Order order) {
        this.order = order;
    }

    public void save() {
        String fileName = "order.json";
        try {
            FileWriter writer = new FileWriter(fileName, false);
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClient().getName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct().getName() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (Exception o) {
            System.out.println("Неверный ввод");
        }
    }

}
