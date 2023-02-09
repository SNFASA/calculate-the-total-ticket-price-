import java.util.Scanner;
public class total{
    public static void main(String [] agrs){
      Scanner sc = new Scanner(System.in);
      System.out.print("number of adult=");
      int adt=sc.nextInt();
      System.out.print("number of Children=");
      int chn = sc.nextInt();
      double total;
       
       total = ( adt*13.50)+(chn*7.90);
       System.out.println("Total price of tiket =" + total);
    }

}