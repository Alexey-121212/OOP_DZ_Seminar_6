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

    public static class ProductType1 extends BaseProduct {
        private ProductType1(String name) {
            super(name);
        }

        public static ProductType1 create(String name) {
            return new ProductType1(name);
        }

        @Override
        public String toString() {
            return "Продукт типа Products.BaseProduct.ProductType1 с названием " + name;
        }
    }
}
