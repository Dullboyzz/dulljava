// Copy Constructor
class Fruit{
    private double fprice;
    private String fname;
    Fruit(double Fprice,String Fname){
        fprice=Fprice;
        fname=Fname;
    }
    Fruit(Fruit fruit){
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        fprice=fruit.fprice;
        fname=fruit.fname;
    }
    double ShowPrice(){
        return fprice;
    }
    String ShowName(){
        return fname;
    }
    public static void main(String args[]){
        Fruit f1=new Fruit (399, "Apple Mango Grapes");
        System.out.println("Name of the First Fruit:-"+f1.ShowName());
        System.out.println("Price of First Fruit:-"+f1.ShowPrice());
        Fruit f2=new Fruit(f1);
        System.out.println("Name of the Second Fruit:-"+f2.ShowName());
        System.out.println("Price of Second Fruit:-"+f2.ShowPrice());
    }
}