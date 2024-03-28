package Products;

public class BaseProduct {
    protected String name;
    protected BaseProduct(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Продукт типа Products.BaseProduct с названием " + name;
    }


}
