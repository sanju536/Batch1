
import java.util.Scanner;

public class Demo038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charecter: ");
        char input1 = sc.next().charAt(0);
        if (Character.isUpperCase(input1)) {
            System.out.println("input1 is uppercase");
        } else if (Character.isLowerCase(input1)) {
            System.out.println("input1 is lowercase");
        } else {
            System.out.println("Not a letter");
        }

        sc.close();
    }
}
