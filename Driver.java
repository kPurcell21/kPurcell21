import java.util.Scanner;

public class Driver {
    private Scanner sc = new Scanner(System.in);
    User user1;

    public static void main(String [] args)
    {
        Driver driver = new Driver();
        driver.addUser();
        driver.printUser();
    }

    public void addUser()
    {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        //creates a new User object
        user1 = new User(name,address,dateOfBirth, height);

    }

    public void printUser()
    {
        System.out.print(user1.toString());
    }



}
