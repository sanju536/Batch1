import java.util.Scanner;
public class Test003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Glossa  gl=new Glossa();
        gl.showdetails(2,65);
        gl.showdetails(3, 43);
        gl.showdetails(1, 55);
        gl.showdetails(4, 43);
        gl.totalsum();
        sc.close();
    }
}
class Glossa{
    int itemno,total ,price;
     String itemname;
     int sum=0;
     public void showdetails(int itemno,int quantity){
    
        switch (itemno) {
        case 1:
            System.out.println("Item no:"+itemno);
            System.out.println("Item name: Rice");
            System.out.println("Quantity: "+quantity);
            price= quantity* 200;
            System.out.println("Price:"+ price);
            sum += price;
            break;
        case 2:
            System.out.println("Item no:"+itemno);
            System.out.println("Item name: wheat");
            System.out.println("Quantity: "+quantity);
            price = quantity *50;
            System.out.println("Price:"+ price);
            sum += price;
            break;
        case 3:
            System.out.println("Item no:"+itemno);
            System.out.println("Item name: flour");
            System.out.println("Quantity: "+quantity);
            price = quantity *100;
            System.out.println("Price:"+ price);
            sum += price;
            break;
        case 4:
            System.out.println("Item no:"+itemno);
            System.out.println("Item name: sugar");
            System.out.println("Quantity: "+quantity);
            price = quantity *60;
            System.out.println("Price:"+ price);
            sum += price;
            break;
        }
    }
        void totalsum(){
            System.out.println("The total sum is: "+sum);
        }
}