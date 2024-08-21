public class Account {
  private double balance;

  public Account(){
    this.balance=0;
  }
  
  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){
    this.balance=balance;
  }

  public void credit(double amount){
    this.balance+=amount;
  }

  public void debit(double amount) throws InsufficientBalanceException{
    if (this.balance<amount)
      // throw new BusinessException(ErrorCode.INSUFF_BAL);
      throw new InsufficientBalanceException();
      //throw new IllegalArgumentException();
    this.balance -= amount;
  }




  public static void main(String[] args){
    Account account= new Account();
    account.credit(100);
    try{
      account.debit(70);
      account.debit(31); //error
    } catch(BusinessException e){ //parent  -> can pick up childen
      System.out.println(e.codeWithMessage()); //Error: -99-Withdrawal amount > Account Balance
    } finally{
      System.out.println("this is a section to run no matter there is exception or not");
    }
    System.out.println(account.getBalance()); //30
  }
}
