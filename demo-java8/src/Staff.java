public class Staff {
  private String departemnt;
  private String name;
  private int salary;
  
  public Staff(String department, String name){
    this.departemnt=department;
    this.name=name;
  }

  public Staff(String department, String name, int salary){
    this.departemnt=department;
    this.name=name;
    this.salary=salary;
  }

  public String getDepartment(){
    return this.departemnt;
  }

  public String getName(){
    return this.name;
  }

  public int getSalary(){
    return this.salary;
  }

  @Override
  public String toString(){
    return "Staff(" 
    + "Name " +this.name +","
    + "Department " + this.departemnt
    +")";
    
    
  }
  
}
