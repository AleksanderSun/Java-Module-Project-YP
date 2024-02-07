import java.util.Scanner;

public class Scaner {
    public static void scaner(){
    Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
    int guests;
        System.out.println("Здраствуйте!\nНа сколько человек необходимо разделить счет?");
        while (true) {
        if (scanner.hasNextInt()) {
            guests = scanner.nextInt();

            if (guests == 1) {
                System.out.println("Вы один. В этом случае нет смысла ничего считать и делить.");
            } else if (guests <= 1) {
                System.out.println("Это некорректное значение для подсчёта.");
            } else if (guests >= 1) {
                System.out.println("Включаем калькулятор товаров!");
                break;
            }
        } else {
            System.out.println("Это неправильное число!");
            scanner.next();
        }
    }
    Calculator calculator = new Calculator();
        calculator.sumProduct();
        System.out.println(calculator.allProduct);
    double totalCost = calculator.sum / guests;
    Formatter formatter = new Formatter();
        formatter.rightFormat(totalCost);
        System.out.println("Счет поделен на: " + guests + " гостей. " + "С каждого по " + formatter.rightFormat(totalCost) + ".");
}
}
