import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args){
    LocalDate ld =LocalDate.of(2022,12,31); //similar to valueOf   一種形態 //
    System.out.println(ld); 

    //LocalDate ld =LocalDate.of(2022,12,32); //java.time.DateTimeException

    System.out.println(ld.plusDays(1L)); //2023-01-01       //int->long upcast 
    System.out.println(ld.plusMonths(3L)); //2023-03-31
    System.out.println(ld.plusYears(2L)); //2024-12-31
    System.out.println(ld.plusWeeks(1L)); //2023-01-07
    System.out.println(ld.minusDays(1L)); //2022-12-30

    Month month = ld.getMonth(); //DECEMBER
    System.out.println(month);
    System.out.println(ld.getMonth().toString());
    System.out.println(ld.getMonthValue()); //DECEMBER


    System.out.println(ld.getYear()); //2022, int
    System.out.println(ld.getDayOfMonth()); //31, int
    System.out.println(ld.getDayOfYear()); //365
  }
}
