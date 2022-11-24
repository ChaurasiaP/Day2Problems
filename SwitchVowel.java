import java.util.*;
class SwitchVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter=sc.nextLine();
        switch (letter){
            case "a":
                System.out.println("Its a vowel");
                break;
            case "e":
                System.out.println("Its a vowel");
                break;
            case "i":
                System.out.println("Its a vowel");
                break;
            case "o":
                System.out.println("Its a vowel");
                break;
            case "u":
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its a consonant");
        }


    }
}
