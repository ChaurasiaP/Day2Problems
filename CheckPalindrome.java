import java.util.*;
class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the number: ");
        int a = sc.nextInt();
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int orgNum=number;
        int reverse=0;
        int modulo=0;
        int c=0;
        while(c<a){
            modulo=number%10;
            reverse=reverse*10+modulo;
            number=number/10;
            c++;
        }
        int reversed=reverse;
        if (reversed==orgNum) {
            System.out.println(orgNum + " is palindrome");
        }
        else{
                System.out.println(orgNum+" is not palindrome");
            }
        }
}
