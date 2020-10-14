import java.util.Scanner;

class Avenger{
  String name,planet;
  int age,power,weapon;
  public void getDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    name=sc.nextLine();
    System.out.println("Enter Planet: ");
    planet=sc.nextLine();
    System.out.println("Enter Age: ");
    age=sc.nextInt();
    System.out.println("Enter Power: ");
    power=sc.nextInt();
    System.out.println("Enter Weapon: ");
    weapon=sc.nextInt();
  }
  public void displayDetails(){
    System.out.println("Name: "+name+" Age: "+age+" Power: "+power+" Weapon: "+weapon+" Planet: "+planet);
  }
}
class Main {
  public static void main(String[] args) {
    Avenger[] aven=new Avenger[5];
    for(int i=0;i<5;i++)
    {
      aven[i]=new Avenger();
      aven[i].getDetails();
    }
    System.out.println("All Avengers detail: \n");
    for(int i=0;i<5;i++)
    {
      aven[i].displayDetails();
    }
  }
}