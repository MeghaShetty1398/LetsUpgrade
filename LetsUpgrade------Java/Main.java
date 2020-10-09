class Employee{
  String name,city;
  int age;
  Employee(String name,int age,String city){
      this.name=name;
      this.age=age;
      this.city=city;
  }
  void display(){
    System.out.println(" The name is "+name+" age is "+age+"city is "+city);
  }
}

class Main {
  public static void main(String[] args) {
    Employee e1=new Employee("Megha",20,"Mumbai");
    Employee e2=new Employee("Sanjana",20,"Chennai");
    e1.display();
    e2.display();
  }
}