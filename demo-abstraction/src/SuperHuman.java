public abstract class SuperHuman {

  private double height;


  public double getHeight(){
    return this.height;
  }

  public SuperHuman(){
  }

  //Why abstract class has constructor 
  public SuperHuman(double height){ 
    this.height=height;
  }
  
}
