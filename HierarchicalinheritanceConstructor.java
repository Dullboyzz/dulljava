class Company{
    String Com_name;
    String Com_Location;
    Company(String n,String l){
        Com_name=n;
        Com_Location=l;
    }
void display(){
    System.out.println("Comapny Name is:-"+Com_name);
    System.out.println("Compnay Location is:-"+Com_Location);
}    
}
class Manager extends Company{
    String M_name;
    int M_Salary;
    Manager(String n,String l,String j,int e){
     super(n,l);
     M_name=j;
     M_Salary=e;
    }
    void display(){
        super.display();
        System.out.println("Manager Name is:-"+M_name);
        System.out.println("Manager Salary is:-"+M_Salary);
    }
}
class Salesman extends Company{
    String SM_name;
    int SM_Salary;
    Salesman(String n,String l,String b,int s){
        super(n,l);
        SM_name=b;
        SM_Salary=s;
    }
    void dispaly(){
        super.display();
        System.out.println("Salesman Name is :-"+SM_name);
        System.out.println("Salesman Salary is:-"+SM_Salary);
    }
}
class Clerk extends Company{
    String C_name;
    int C_Salary;
    Clerk(String n,String l,String h,int t){
        super(n,l);
        C_name=h;
        C_Salary=t;
    }
    void display(){
        super.display();
        System.out.println("Clerk Name is:-"+C_name);
        System.out.println("Clerk Salary is"+C_Salary);      
    }
}
public class HierarchicalinheritanceConstructor{
 public static void main(String[] args){
     Manager obj1=new Manager("Apple","India","Priyanshu",50000);
     Salesman obj2=new Salesman("Apple","india","Sachin",30000);
     Clerk obj3=new Clerk("Apple","India","Arshiyan",25000);
     obj1.display();
     obj2.dispaly();
     obj3.display();
 }   
}