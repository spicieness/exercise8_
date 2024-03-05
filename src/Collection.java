import java.util.ArrayList;
import java.util.Objects;

public class Collection {

    ArrayList<ContactInfo> contacts = new ArrayList();

    public void addContact(ContactInfo a){

        contacts.add(a);
        System.out.println(contacts);

    }

    @Override
    public String toString() {
        return "Collection{" +
                "contacts=" + contacts +
                '}';
    }
}
