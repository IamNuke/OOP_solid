package Core.Structure;

import Core.Models.Contact;
import Core.Models.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements Catalog <PhoneContact>, IGetContacts {

    private final List<PhoneContact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<PhoneContact>();
    }

    // create
    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }
    @Override
    public boolean add(PhoneContact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    @Override
    public PhoneContact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    @Override
    public boolean remove(PhoneContact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    public int count() {
        return contacts.size();
    }

    @Override
    public List<PhoneContact> getContacts () {
        return contacts;
    }
}
