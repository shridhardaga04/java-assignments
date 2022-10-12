package isp.violation;

public class VegHotel implements Menu{
    @Override
    public void vegMenu() {
        System.out.println("veg menu details...");
    }
    @Override
    public void nonVegMenu() {
        System.out.println("NOT REQUIRED");
    }

    @Override
    public void drinksMenu() {
        System.out.println("NOT REQUIRED");
    }
}
