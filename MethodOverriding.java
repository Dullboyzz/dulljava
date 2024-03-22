//method overriding 
class vehical{
    void run(){
    System.out.println("Vehical Run fast");
    }
}
class bike extends vehical{
    void run(){
        System.out.println("bike Run fast");
        }
}
public class MethodOverriding{
    public static void main(String[] args) {
        bike b=new bike();
        b.run();
    }
}