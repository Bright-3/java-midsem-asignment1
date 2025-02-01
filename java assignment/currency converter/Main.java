import currency.CurrencyConverter;
import distance.DistanceConverter;
import time.TimeConverter;

public class Main {
    public static void main(String[] args) {
        // Currency Conversion
        System.out.println("100 USD to GH: " + CurrencyConverter.dollarToGh(100));
        System.out.println("100 GH to USD: " + CurrencyConverter.ghToDollar(100));
        System.out.println("100 EURO to GH: " + CurrencyConverter.euroToGh(100));
        System.out.println("100 GH to EURO: " + CurrencyConverter.ghToEuro(100));
        System.out.println("100 YEN to GH: " + CurrencyConverter.yenToGh(100));
        System.out.println("100 GH to YEN: " + CurrencyConverter.ghToYen(100));

        // Distance Conversion
        System.out.println("1000 Meters to KM: " + DistanceConverter.meterToKm(1000));
        System.out.println("1 KM to Meters: " + DistanceConverter.kmToMeter(1));
        System.out.println("10 Miles to KM: " + DistanceConverter.milesToKm(10));
        System.out.println("10 KM to Miles: " + DistanceConverter.kmToMiles(10));

        // Time Conversion
        System.out.println("2 Hours to Minutes: " + TimeConverter.hoursToMinutes(2));
        System.out.println("120 Minutes to Hours: " + TimeConverter.minutesToHours(120));
        System.out.println("2 Hours to Seconds: " + TimeConverter.hoursToSeconds(2));
        System.out.println("7200 Seconds to Hours: " + TimeConverter.secondsToHours(7200));
    }
}