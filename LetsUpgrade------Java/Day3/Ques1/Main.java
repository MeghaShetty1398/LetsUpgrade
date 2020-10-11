import java.util.Scanner;
import java.util.Date;

class Employee{
  String name;
  int date_of_birth,month_of_birth,year_of_birth;
  double salary;
  Employee(String n, int d,int m,int y,double s){
    name=n;
    date_of_birth=d;
    month_of_birth=m;
    year_of_birth=y;
    salary=s;
  }
  void display_detail(){

    double tax_amount=0;
    Date d=new Date();
    int current_year=d.getYear()+1900;
    if(salary>=500000){
      tax_amount=salary*0.20;
    }
    else if(salary>=400000 && salary<500000){
      tax_amount=salary*0.15;
    }
    else if(salary>=300000 && salary<400000){
      tax_amount=salary*0.10;
    }
    else if(salary>=200000 && salary<300000){
      tax_amount=salary*0.5;
    }
    else if(salary>=400000 && salary<500000){
      tax_amount=salary*0.0;
    }
    System.out.println("Name of Employee is: "+name);
    System.out.println("Age of Employee is: "+(current_year-year_of_birth));
    System.out.println("Tax Amount is: "+tax_amount);
  }
}

class Main {
  public static void main(String[] args) {
    String name;
    int date_of_birth,month_of_birth,year_of_birth;
    double salary;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee name: ");
    name=sc.nextLine();
    System.out.println("Enter Date of Birth: ");
    date_of_birth=sc.nextInt();
    System.out.println("Enter Month of Birth: ");
    month_of_birth=sc.nextInt();
    System.out.println("Enter Year of Birth: ");
    year_of_birth=sc.nextInt();
    System.out.println("Enter Salary: ");
    salary=sc.nextDouble();

    Employee e1=new Employee(name,date_of_birth,month_of_birth,year_of_birth,salary);

    e1.display_detail();

  }
}