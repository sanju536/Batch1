public class Emp {
    static int Id;
        String Firstname;
        String Lastname;
        String Address;
        Emp(){
           this.Id=0;
           this.Firstname="";
           this.Lastname="";
           this.Address=""; 
           
        }
        Emp(int Id,String Firstname,String Lastname,String Address){
            this.Id=Id;
            this.Firstname=Firstname;
            this.Lastname=Lastname;
            this.Address=Address;
            System.out.println( Id+"\n"+Firstname+"\n"+Lastname+"\n"+Address);

        }
         void getFullname(){
            
            System.out.println(Firstname+" "+Lastname);
        }
        public static void main(String[] args){
            Emp em =new Emp();
            Emp emp=new Emp(536,"Sanjay","Bhargav","Gandimaisamma");
            emp.getFullname();
            
    }

}