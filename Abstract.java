//Abstract class
abstract class Person{
    public abstract void display();
}
class Employee extends Person{
    int empno;
    String empname,addr;
    public Employee(int empno,String empname,String addr){
        this.empno=empno;
        this.empname=empname;
        this.addr=addr;
    }
    public void display(){
        System.out.println("Employee Details");
        System.out.println("Employee id is:"+empno);
        System.out.println("Employee name is:"+empname);
        System.out.println("Employee Address is:"+addr);
    }
}
class Worker extends Person{
    int hrs;
    String name;
    public Worker(int hrs,String name){
        this.hrs=hrs;
        this.name=name;
    }
    public void display(){
        System.out.println("Worker details");
        System.out.println("Worker working hours:"+hrs);
        System.out.println("Worker name:"+name); 
    }
} 
public class Abstract {
    public static void main(String[] args) {
        Employee e=new Employee(1,"Sachin","Mumbai");
        e.display();
        Worker w=new Worker(12,"Suraj");
        w.display();
    }   
}