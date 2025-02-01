package currency;

public class CurrencyConverter {
    // Conversion rates as of the knowledge cutoff in 2023
    private static final double USD_TO_GH = 10.5;
    private static final double EURO_TO_GH = 12.0;
    private static final double YEN_TO_GH = 0.08;

    public static double dollarToGh(double amount) {
        return amount * USD_TO_GH;
    }

    public static double ghToDollar(double amount) {
        return amount / USD_TO_GH;
    }

    public static double euroToGh(double amount) {
        return amount * EURO_TO_GH;
    }

    public static double ghToEuro(double amount) {
        return amount / EURO_TO_GH;
    }

    public static double yenToGh(double amount) {
        return amount * YEN_TO_GH;
    }

    public static double ghToYen(double amount) {
        return amount / YEN_TO_GH;
    }
}