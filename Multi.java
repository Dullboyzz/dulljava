//Interface
import java.util.Scanner;
interface studentt{
    void getDetails();
}
interface sports{
    void getSportsMarks();
}
class Result implements studentt, sports{
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int marks;
    int sMarks;

    public void getDetails(){
        System.out.println("Enter your id:");
        id=sc.nextInt();
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your marks:");
        marks=sc.nextInt();
    }

    public void getSportsMarks(){
        System.out.println("Enter your sports marks:");
        sMarks=sc.nextInt();
    }

    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("Sports Marks:"+sMarks);
    }
}

public class Multi{
    public static void main(String[] args){
        Result obj=new Result();
        obj.getDetails();
        obj.getSportsMarks();
        obj.display();
    }
}