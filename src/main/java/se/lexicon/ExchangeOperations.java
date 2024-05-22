package se.lexicon;

import java.text.DecimalFormat;

public class ExchangeOperations {

    // convertSEKToUSD
    // convertUSDToSEK
    // convertSEKToEuro
    // convertEuroToSEK


    public static double convertSEKToUSD(double sekAmount) {
        double usdAmount = sekAmount * ExchangeRates.usdToSekRate;
        return usdAmount;
    }

    public static double convertUSDToSEK(double usdAmount) {
        double sekAmount = usdAmount * ExchangeRates.sekToUsdRate;
        return sekAmount;
    }


    public static double convertSekToEuro(double sekAmount) {
        double euroAmount = sekAmount * ExchangeRates.euroToSekRate;
        return euroAmount;
    }

    public static double convertEuroToSek(double euroAmount) {
        double sekAmount = euroAmount * ExchangeRates.sekToEuroRate;
        return sekAmount;
    }

    public static String formatNumber(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        return decimalFormat.format(amount);
    }
}
