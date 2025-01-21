public class PartTimeEmployee extends Emp {
    int hoursWorked;
    int amountPerHour;

    PartTimeEmployee() {
        this.hoursWorked = 0;
        this.amountPerHour = 0;
        System.out.println("Non-parameterised");
    }

    PartTimeEmployee(int Id, String Firstname, String Lastname, String Address, int hoursWorked, int amountPerHour) {
        this.Id = Id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Address = Address;
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
        System.err.println(
                Id + "\n" + Firstname + "\n" + Lastname + "\n" + Address + "\n" + hoursWorked + "\n" + amountPerHour);
    }

    public void Computesal() {
        System.out.println("Computsal:" + hoursWorked * amountPerHour);
    }

    void ShowDetails() {
        System.out.println("Id: " + Id);
        System.out.println("Firstname: " + Firstname);
        System.out.println("Lastname: " + Lastname);
        System.out.println("Address: " + Address);
        System.out.println("HoursWorked: " + hoursWorked);
        System.out.println("Amountperhour: " + amountPerHour);
        System.out.print("Total sal: ");
        Computesal();
    }

    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee();
        PartTimeEmployee pt = new PartTimeEmployee(536, "Sanjay", "Bhargav", "Maisammaguda", 365, 400);
        pt.Computesal();
        pt.ShowDetails();
    }
}