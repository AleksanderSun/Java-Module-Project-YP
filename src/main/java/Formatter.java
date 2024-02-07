public class Formatter {
    public String rightFormat(double floatTotal) {
        double total = (Math.floor(floatTotal)) % 100;
        double t = total % 10;
                if (total == 0) {
                   String rightTotal = String.format("%.2f", floatTotal) + " рублей";
                } else if (total > 10 & total <20) {
                    return String.format("%.2f", floatTotal) + " рублей";
                } else if (t == 1) {
                    return String.format("%.2f", floatTotal) + " рубль";
                } else if (t > 1 & t < 5) {
                    return String.format("%.2f", floatTotal) + " рубля";
                } else {
                    return String.format("%.2f", floatTotal) + " рублей";
                }

        return null;
    }
}
