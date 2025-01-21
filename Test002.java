import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String reply;
        while(true){
            System.out.print("Enter the value: ");
            reply=sc.nextLine();
            if(reply.equals("yes")){
                System.out.println("Happy Sankrati");
            }else{
            System.out.println("Out of loop");
            break;
            }
        }
        sc.close();
    }
}