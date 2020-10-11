import java.util.Scanner;

class Student{
  String name;
  int m1,m2,m3,m4,m5;
  Student(String n,int n1,int n2,int n3,int n4,int n5)
  {
    name=n;
    m1=n1;m2=n2;m3=n3;m4=n4;m5=n5;
  }
  void display_details()
  {
    System.out.println("Name of student is: "+name);
    int total=m1+m2+m3+m4+m5;
    float per=((total*100)/500);
    System.out.println("Percentage is: "+per+"%");
    if(per>=90){  System.out.println("Grade A");}
    else if(per>=75 && per<90){  System.out.println("Grade B");}
    else if(per>=60  && per<75){  System.out.println("Grade C");}
    else if(per>=40 && per<60){  System.out.println("Grade D");}
    else{ System.out.println("Grade E");}
  }
}

class Main {
  public static void main(String[] args) {
    String name;
    int m1,m2,m3,m4,m5;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student name: ");
    name=sc.nextLine();
    System.out.println("Enter Subject 1 marks:");
    m1=sc.nextInt();
    System.out.println("Enter Subject 2 marks:");
    m2=sc.nextInt();
    System.out.println("Enter Subject 3 marks:");
    m3=sc.nextInt();
    System.out.println("Enter Subject 4 marks:");
    m4=sc.nextInt();
    System.out.println("Enter Subject 5 marks:");
    m5=sc.nextInt();
    Student s1=new Student(name,m1,m2,m3,m4,m5);
    s1.display_details();
  }
}