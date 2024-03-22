//Defualt Constructor
class DefualtConstructor
{
int id;
String name;
void display()
{
System.out.println(id+""+name);
}
public static void main(String args[]){
DefualtConstructor s1=new DefualtConstructor();
DefualtConstructor s2=new DefualtConstructor();
s1.display();
s2.display();
}
}