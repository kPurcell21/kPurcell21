public class User {
    //4 private instance fields
    private String name;
    private String address;
    private String dateOfBirth;
    private double height;

    //constructor
    public User(String nameIn, String addressIn, String dateOfBirthIn, double heightIn)
    {
        this.name = nameIn;
        this.address = addressIn;
        this.dateOfBirth = dateOfBirthIn;
        this.height = heightIn;
    }

    //get methods
    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public double getHeight()
    {
        return this.height;
    }

    //set methods

    public void setName(String nameIn)
    {
        this.name = nameIn;
    }

    public void setAddress(String addressIn)
    {
        this.address = addressIn;
    }

    public void setDateOfBirth(String dateOfBirthIn)
    {
        this.dateOfBirth = dateOfBirthIn;
    }

    public void setHeight(double heightIn)
    {
        this.height = heightIn;
    }

    public String toString()
    {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Height: " + height + "\n";
    }
}
