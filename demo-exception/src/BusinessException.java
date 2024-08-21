public class BusinessException extends Exception{ //implies it is checked exception
  private int code;

  public int getCode(){
    return this.code;
  }

  // // implies this is checked exception
  // public BusinessException(int errorCode , String message){
  //   super(message);
  //   this.errorCode=errorCode;
  // }  

  public BusinessException(ErrorCode errorCode){
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
  }

  // Encapsulation
  public String codeWithMessage(){
    return "Error: " + this.code + "-" + this.getMessage();
  }

}
