public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 15, 500, false);
        TelcoSubscription globe = new Telco("Globe", 10, 450, true);
        TelcoSubscription ditto = new Telco("Ditto", 8, 400, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli, globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli, ditto.getUnliCallText()));
    }
}