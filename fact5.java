import java.io.*;
class fact5
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int input1=sc.nextInt();
  int fact=1;
  for(int i=1;i<input1;i++)
    {
     int temp=fact*i;
     fact=temp;
     }
  System.out.println(fact);
  }
}
  
     
