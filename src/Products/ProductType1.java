package Products;

public class ProductType1 extends BaseProduct {
    private ProductType1(String name) {
        super(name);
    }

    public static ProductType1 create(String name) {
        return new ProductType1(name);
    }

    @Override
    public String toString() {
        return "Продукт типа Products.ProductType1 с названием " + name;
    }
}
