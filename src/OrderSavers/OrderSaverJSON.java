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
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + Order.getclientName + "\",\n");
            writer.write("\"product\":\"" + Order.getProduct + "\",\n");
            writer.write("\"qnt\":" + qnt + ",\n");
            writer.write("\"price\":" + price + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
