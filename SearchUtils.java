public class SearchUtils {

    public static Product binarySearch(Product[] products, String productName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = productName.compareToIgnoreCase(products[mid].getProductName());

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }

    // Optional: You can also include linearSearch here
    public static Product linearSearch(Product[] products, String productName) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }
}