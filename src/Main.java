public class Main {
    public static void main(String[] args) {

        ContactInfo contact1 = new ContactInfo("dyl", "email@email.com");
        contact1.display();

        BusinessContact contact2 = new BusinessContact("someone else", "otherpersonsemail@email.com", "4683628262");
        contact2.display();

        Collection collection = new Collection();
        collection.addContact(contact1);
        System.out.println(collection);

        collection.addContact(contact2);
    }
}