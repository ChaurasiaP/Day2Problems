import java.util.*;
class OperatorsFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter athird number");
        int c=sc.nextInt();
        int s1=a+b*c;
        int s2=c+a/b;
        int s3=a%b+c;
        int s4=a*b+c;

        System.out.println("a+b*c: "+s1);
        System.out.println("c+a/b: "+s2);
        System.out.println("a%b+c: "+s3);
        System.out.println("a*b+c: "+s4);

        if (s1>s2 && s1>s3) {
            System.out.println("Maximum is case s1: " + s1);
        }
        else if (s2>s1 && s2>s3) {
            System.out.println("Maximum is s2: " + s2);
        }
        else {
            System.out.println("Maximum is s3: " + s3);
        }
        if (s1<s2 && s1<s3) {
            System.out.println("s1 is Minimum "+s1);
        }
        else if (s2<s1 && s2<s3) {
            System.out.println("s2 is Minimum "+s2);
        }
        else {
            System.out.println("s3 is Minimum ");
        }
        }
    }
