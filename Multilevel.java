//Multilevel
import java.util.Scanner;
class student{
    Scanner SC = new Scanner(System.in);
    String name;
    int rollno;
    void getDetails(){
        System.out.println("Enter Your Name :");
        name=SC.next();
        System.out.println("Enter Your Roll No :");
        rollno=SC.nextInt();
    }
}
class marks extends student{
    int java;
    int python;
    int maths;
    float total;
    float average;
    void getmarks(){
        System.out.println("Enter Your Java Marks :");
        java=SC.nextInt();
        System.out.println("Enter Your Python Marks :");
        python=SC.nextInt();
        System.out.println("Enter Your Maths Marks :");
        maths=SC.nextInt();
        total=java+python+maths;
        average=total/3;
        System.out.println("Your Total Marks is :"+total);
        System.out.println("Your average Marks is :"+average);
    }
}
class Result extends marks{
    void display(){
        System.out.println("RollNo :"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Java :"+java);
        System.out.println("Python :"+python);
        System.out.println("Maths :"+maths);
        System.out.println("Total :"+total);
        System.out.println("Percentage :"+average);
    }
}
public class Multilevel{
    public static void main(String[] args) {
        Result obj=new Result();
        obj.getDetails();
        obj.getmarks();
        obj.display();
    }
}