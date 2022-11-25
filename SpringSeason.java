import java.util.*;

class SpringSeason {
    public static void main(String[] args) {

        // TAKE DATE INPUT
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date: ");
        int d=sc.nextInt();

        //TAKE MONTH INPUT
        Scanner str=new Scanner(System.in);
        System.out.print("Enter Month: ");
        String m=str.nextLine();

        //CHECK FOR MONTH FIRST THEN CHECK FOR THE VALID DATE
        if (m.equalsIgnoreCase("March") ) {
            if (d >= 20 && d<=31) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }

        else if (m.equalsIgnoreCase("April") || m.equalsIgnoreCase("May")){
            if ( d >=1 && d <= 31 ){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }

        else if (m.equalsIgnoreCase("June") ){
            if ( d <= 20 ){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else {
            System.out.println("Enter Valid input");
        }


   }
}

