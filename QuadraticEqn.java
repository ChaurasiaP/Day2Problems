import java.util.*;
import java.math.*;

class QuadraticEqn {
    public static void main(String[] args) {
        System.out.println("ENTER DISTINCT NON ZERO VALUES");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Coeff of x**2: ");
        int a = sc.nextInt();

        System.out.print("Enter Coeff of x: ");
        int b = sc.nextInt();

        System.out.print("Enter a constant: ");
        int c = sc.nextInt();

        System.out.println("The Quadratic Equation is: "+a+("(x**2)+ ")+b+("x+ ")+c);

        int dtrmnnt=(b*b-4*a*c);
        System.out.println(dtrmnnt);

        if (dtrmnnt<0){
            System.out.println("ROOTS ARE IMAGINARY");
        }
        else if (dtrmnnt>0){
            System.out.println("ROOTS ARE REAL AND DISTINCT");
            double root1 = (-b + (Math.sqrt(dtrmnnt))) / (2 * a);
            double root2 = (-b - (Math.sqrt(dtrmnnt))) / (2 * a);

            System.out.println("First Root: " + root1);
            System.out.println("Second Root: " + root2);
        }
        else if (dtrmnnt==0){
            System.out.println("ROOTS ARE REAL AND EQUAL");
            double root1 = (-b + (Math.sqrt(dtrmnnt))) / (2 * a);
            double root2 = (-b - (Math.sqrt(dtrmnnt))) / (2 * a);

            System.out.println("First Root: " + root1);
            System.out.println("Second Root: " + root2);
        }

    }
}
