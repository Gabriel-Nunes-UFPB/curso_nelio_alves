package util;
public class CurrencyConverter {
    public static double dollarPrice;
    public static double dollarsBought;
    public final static double IOF = 0.06;

    public static double AmountToBePaid(){
        double amoutToBePaid = dollarPrice * dollarsBought;
        return amoutToBePaid += amoutToBePaid * IOF;

    }
}
