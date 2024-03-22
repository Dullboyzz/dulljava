//Static Method
class Studentt {
    int rollno;
    String name;
    static String college="UOM";
    static void change(){
        college=" LUC";
    }
    Studentt(int r, String n){
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno + "" + name + "" + college);
    }
}
public class StaticMethod{
    public static void main(String arg[]){
        Studentt.change();
        Studentt s1=new Studentt(63, " Aditya");
        Studentt s2=new Studentt(62, " Sachin");
        Studentt s3=new Studentt(86, " Abhishek");
        s1.display();
        s2.display();
        s3.display();
        }
    }