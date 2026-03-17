package Lab5.singleton;

import Lab5.contracts.Product;
import Lab5.contracts.ProductCreator;
import Lab5.factories.ProductFactory;

import java.util.ArrayList;
import java.util.List;

public class Brochure {
    private static Brochure instance;

    private List<Product> products;

    private Brochure() {
        this.products = new ArrayList<>();
    }

    public static Brochure getInstance() {
        if(instance == null) {
            instance = new Brochure();
        }
        return instance;
    }

    public void addProduct(ProductCreator factory, String name) {
        products.add(ProductFactory.createProduct(factory, name));
    }

    public String getBrochureCatalog() {
        StringBuilder sb = new StringBuilder();
            for(Product p : products) {
                sb.append(p.getProductDescription()).append("\n");
            }
        return sb.toString();
    }
}
