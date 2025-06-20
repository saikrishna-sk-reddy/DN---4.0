import java.util.Arrays;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Luggage")
        };
        String target = "Laptop";
        System.out.println("🔍 Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, target);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        System.out.println("🔍 Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, target);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}