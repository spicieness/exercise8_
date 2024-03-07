public class Main {
    public static void main(String[] args) {

        // these are the contacts
        ContactInfo contact1 = new ContactInfo("dyl", "email@email.com");
        BusinessContact contact2 = new BusinessContact("someone else", "otherpersonsemail@email.com", "4683628262");

        // for testing --- contact1.display();
        // for testing --- contact2.display();

        // add contacts to collection
        Collection collection = new Collection();
        collection.addContact(contact1);
        collection.addContact(contact2);


        // it runs !!
        System.out.println();
        System.out.println();
        collection.displayAll();


    }
}