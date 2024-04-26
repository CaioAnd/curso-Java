public class CurrencyConverter {

    public static double converter(double dollarValue, double quantity) {
        double value = dollarValue * quantity;

        return value + (value * 6 / 100);
    }
}
