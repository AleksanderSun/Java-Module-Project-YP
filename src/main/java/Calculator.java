import java.util.Scanner;

public class Calculator {
    double sum = 0.00;
    String allProduct = "Добавленные товары: \n";

    public void sumProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        while (true) {
            System.out.println("Введите название товара:");
            product.productName = scanner.next();
            allProduct = allProduct + product.productName + "\n";
            while (true) {
                System.out.println("Ведите стоимость товара (Стоимость должна быть в формате рубли.копейки, например 10,45 или 11,40)");
                if (scanner.hasNextDouble()) {
                    product.cost = scanner.nextDouble();
                    if (product.cost <= 0) {
                        System.out.println("Стоимость товара должна быть выше 0");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Неверный формат ввода");
                    scanner.next();
                }
            }
            sum = sum + product.cost;

            String formatedCost = String.format("%.2f", product.cost);
            System.out.println("Товар " + product.productName + " добавлен. Его стоимость " + formatedCost);

            System.out.println("Для добавления других товаров, введите любой символ. Для завршения ввода товаров наберите \"Завершить\"");
            String exit = scanner.next();
            if (exit.equalsIgnoreCase("Завершить")) {
                String formatedSum = String.format("%.2f", sum);
                System.out.println("Добавлено товаров на сумму: " + formatedSum);
                break;
            }

        }
    }

}