//Method Overloading
class MethodOverloading
{
  public int sum(int x,int y)
  {
      System.out.println("This is Addition of two integer number is:- "+(x+y));
      return x+y;
  }
  public int sum(int x,int y, int z)
  {
      System.out.println("This is Addition of three integer number is:- "+(x+y+z));
      return x+y+z;
  }
  public double sum(double x,double y)
  {
      System.out.println("This is Addition of two double number is:- "+(x+y));
      return x+y;
  }
  public static void main(String args[])
  {
      MethodOverloading a=new MethodOverloading();
      a.sum(20,40);
      a.sum(20,40,60);
      a.sum(12.5, 19.7);
  }
}