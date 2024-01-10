import java.util.Scanner;

public class RandomNumber {

   public static void main(String[] args) {
      Scanner sc=new  Scanner(System.in);
      int usernumber;
      int mynumber=(int)(Math.random()*100);
      do{
         System.out.print("Guess my number(1-100) :");
          usernumber=sc.nextInt();
         if(usernumber==mynumber){
            System.out.println("whoo ...correct number");
            break;
         }
         else if (usernumber>mynumber){
            System.out.println("your number is too large");
         } else
         {
            System.out.println("your number is short");
         }
      }while(usernumber>=0);
      System.out.print("mynumber was :");
      System.err.println(mynumber);
   }
}
