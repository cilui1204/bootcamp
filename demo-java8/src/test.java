@FunctionalInterface
interface EmployeeEmpty{
  Employee get();
}

interface EmployeeNamed{
  Employee get(String sss);
}




class Employee{
  private String name;


  public Employee(){
    System.out.println("Creating an employee");
  }

  public Employee(String name ){
    System.out.println("Creating an named employee");
    this.name = name;
  }

  public String toString(){
   return "Name" +  this.name;
  }
}



public class test {
  public static void main(String[] args){
    EmployeeEmpty employ = Employee::new;
    System.out.println(employ.get());

    EmployeeNamed employ2 = Employee::new;
    System.out.println(employ2.get("Joseph"));
  }
  
  
}

