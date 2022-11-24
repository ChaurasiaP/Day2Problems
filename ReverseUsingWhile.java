import java.util.*;
class ReverseUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total digits in the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int reverse=0;
        int modulo=0;
        int c=0;
        while(c<a){
            modulo=number%10;
            reverse=reverse*10+modulo;
            number=number/10;
            c++;
        }
        System.out.println("Reversed number is: "+reverse);
    }
}
