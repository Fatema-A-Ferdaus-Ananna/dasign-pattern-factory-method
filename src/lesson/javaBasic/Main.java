package lesson.javaBasic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory();

        Scanner scanner = new Scanner(System.in);
        String product_type = scanner.nextLine();

        Product product = productFactory.get_product(product_type);
        product.printProduct();

    }
}
