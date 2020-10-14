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
    System.out.println("Addition of all 5 number is: "+sum);
  }
}