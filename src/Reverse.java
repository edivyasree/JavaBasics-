public class Reverse {
    public static void main(String[] args) {
        int number=56789,reverse=0;
       
        //using while
    //    while (number!=0) {
        
    //     int remainder=number%10;
    //     System.out.println(remainder+"remainder");
    //     reverse=reverse*10+remainder;
    //     System.out.println(reverse+"reverse");
    //     number=number/10;
    //     System.out.println(number+"number");
    //    }
    //    System.out.println("the reverse number is"+reverse);
    for(;number!=0;number=number/10){
        int remainder=number%10;
        reverse=reverse*10+remainder;
        System.out.println("Reverse number is"+reverse);

    }
    }
}
