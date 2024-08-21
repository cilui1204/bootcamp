
public class Student extends Person{

  private int studentId;
  // private int age;
  //private String name;

  // Constructor -> process of constructing student objects
  public Student(int studentId, String name, int age){
    // public Student(String name, int studentId, int age){
    // calling Parent class constructor ...
    // 1. Create Person Object inside Student object (heap object)
    super(name, age); 
    this.studentId=studentId;
    // this.age=age;
    // this.name=name;
  }


  // public String getName(){
  //   return this.name;
  // }

  public int getStudentId(){
    return this.studentId;
  }

  public void setAge(int age){
    //2. call parent object
    super.setAge(age);
  }

  // public int getAge(){
  //   return this.age;
  // }

  public static void main(String[] args){
    Student s = new Student(1, "Vincent", 13); // Student object in heap memory
    // System.out.println(s.getAge());
    // System.out.println(s.getStudentId());
    // System.out.println(s.getName());
    s.setAge(13);
  }

}
