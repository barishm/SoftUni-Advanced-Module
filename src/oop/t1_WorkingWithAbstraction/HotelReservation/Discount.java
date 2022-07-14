package oop.t1_WorkingWithAbstraction.HotelReservation;

public enum Discount {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    private double priceReduction;

    private Discount(double priceReduction){
        this.priceReduction = priceReduction;
    }

    public static Discount parse(String str) {
        switch (str){
            case "VIP":
                return VIP;
            case"SecondVisit":
                return SECOND_VISIT;
            case"None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown enum value: "+str);
        }
    }

    public double getPriceReduction() {
        return priceReduction;
    }
}
