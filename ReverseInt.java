import java.util.*;
class ReverseInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total digits of the number: ");
        int a=sc.nextInt();
        System.out.println("Enter The number: ");
        int number=sc.nextInt();
        int num1=0;
        int reverse=0;
        for (int i=0; i<a; i++){
            num1=number%10;
            reverse=reverse*10+num1;
            number=number/10;
        }
        System.out.println("Reversed Digit is: "+reverse);
    }

}
