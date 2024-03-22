//Inheritance
import java.util.Scanner;
class Account{
    Scanner SC = new Scanner(System.in);
    int user_id;
    int password;
    void getDetails(){
        System.out.println("Enter your User id: ");
        user_id = SC.nextInt();
        System.out.println("Enter your Password:");
        password = SC.nextInt();
    }
    void putDetails(){
        System.out.println("User ID : "+user_id);
        System.out.println("Password : "+password);
    }
}
class Saving extends Account{
    Scanner SC = new Scanner(System.in);
    int S_account;
    int S_balance;
    void getSaving(){
        System.out.println("Enter Your Saving account :");
        S_account=SC.nextInt();
        System.out.println("Enter Your Saving balance :");
        S_balance=SC.nextInt();
    }
    void putSaving(){
        System.out.println("Saving account :"+S_account);
        System.out.println("Saving balance :"+S_balance);
    }
}
class Current extends Account{
    Scanner SC = new Scanner(System.in);
    int C_account;
    int C_balance;
    void getCurrent(){
        System.out.println("Enter Your Current account :");
        C_account=SC.nextInt();
        System.out.println("Enter Your Current balance :");
        C_balance=SC.nextInt();
    }
    void putCurrent(){
        System.out.println("Current account :"+C_account);
        System.out.println("Current balance :"+C_balance);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Account obj1=new Account();
        Saving obj2=new Saving();
        Current obj3=new Current();
        obj1.getDetails();
        obj1.putDetails();
        obj2.getSaving();
        obj2.putSaving();
        obj3.getCurrent();
        obj3.putCurrent();
    }
}