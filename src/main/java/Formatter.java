public class Formatter {
    String rightTotal;
    public void rightFormat(double floatTotal) {
        double total = (Math.floor(floatTotal)) % 100;
        double t = total % 10;
                if (total == 0) {
                    rightTotal = String.format("%.2f", floatTotal) + " рублей";
                } else if (total > 10 & total <20) {
                    rightTotal = String.format("%.2f", floatTotal) + " рублей";
                } else if (t == 1) {
                    rightTotal = String.format("%.2f", floatTotal) + " рубль";
                } else if (t > 1 & t < 5) {
                    rightTotal = String.format("%.2f", floatTotal) + " рубля";
                } else {
                    rightTotal = String.format("%.2f", floatTotal) + " рублей";
                }

    }
}
