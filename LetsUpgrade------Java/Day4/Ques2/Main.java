import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter 5 number: ");
    Scanner sc=new Scanner(System.in);
    int[] num=new int[5];
    int sum=0;
    for(int i=0;i<5;i++)
    {
      num[i]=sc.nextInt();
      sum=sum+num[i];
    }
     System.out.println("Odd number from entered number: ");
    for(int i=0;i<5;i++)
    {
      if(num[i]%2==1)
      {
       System.out.println(num[i]+" "); 
      }
    }
  }
}