//Copy Constructor
class CopyConstructor {
    private double fprice;
    private String fname;
    CopyConstructor(double Fprice, String Fname) {
        fprice = Fprice;
        fname = Fname;
    }
    CopyConstructor(CopyConstructor fruit) {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }
    double showPrice() {
        return fprice;
    }
    String showName() {
        return fname;
    }
    public static void main(String args[]) {
        CopyConstructor f1 = new CopyConstructor(399, "Apple Mango Grapes");
        System.out.println("Name of the First Fruit: " + f1.showName());
        System.out.println("Price of First Fruit: " + f1.showPrice());
        CopyConstructor f2 = new CopyConstructor(f1);
        System.out.println("Name of the Second Fruit: " + f2.showName());
        System.out.println("Price of Second Fruit: " + f2.showPrice());
    }
}