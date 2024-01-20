//Parameterized Constructor
class student
{
int id;
String name;
student(int i,String n)
{
id = i;
name = n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
student s1 = new student(111,"Aditya");
student s2 = new student(222,"Sachin");
s1.display();
s2.display();
}
}