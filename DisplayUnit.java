import java.util.*;

class DisplayUnit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 or 10 or 100 or 1000");
        int a=sc.nextInt();
        if ( a == 1 ) {
            System.out.println("Ones digit");
        }
        else if ( a == 10) {
            System.out.println("Tens Digit");
        }
        else if ( a == 100) {
            System.out.println("Hundreds Digit");
        }
        else if ( a == 1000) {
            System.out.println("Thousands Digit");
        }
    }
}
