
public class Day13 {
    public static void main(String[] args) {
        Product product = new Product("Java Book", 150_000);
        System.out.println(new Order(product, OrderStatus.PAID));
    }
}

enum OrderStatus { NEW, PAID, SHIPPED, CANCELLED }

record Product(String name, long price) {
    Product {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Tên trống");
        if (price < 0) throw new IllegalArgumentException("Giá âm");
    }
}

record Order(Product product, OrderStatus status) {}
