package projection.example2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Product-1", 99.99, true),
                new Product("Product-2", 58.65, false),
                new Product("Product-3", 80, true),
                new Product("Product-4", 45.36, true)
        );

        List<String> availableProductWithPrice = products.stream()
                .filter(Product::isAvailable)
                .map(product -> product.getName() + ": $" + product.getPrice()).toList();

        availableProductWithPrice.forEach(product -> System.out.println(product));

    }
}
