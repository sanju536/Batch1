public class Test001 {
    public static void main(String[] args) {
        int i=0;
        for( i=1;i<=10;i++){
            if(i==5 || i==7){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}