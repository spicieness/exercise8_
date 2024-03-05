public class BusinessContact extends ContactInfo{

    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Name: "+super.getName()+" -- Email: "+super.getEmail()+" -- Phone Number: "+phoneNumber);
    }
}