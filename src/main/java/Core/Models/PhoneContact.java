package Core.Models;

import Core.Structure.PhoneBook;

public class PhoneContact extends Contact implements Comparable<PhoneContact>  {
    protected String phone;
    public PhoneContact(String firstName,
                        String lastName,
                        String description,
                        String phone) {
        super(firstName, lastName, description);
        this.phone = phone;

    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int compareTo(PhoneContact o) {
        if ((firstName.compareTo(o.getFirstName()) > 0)
                && (lastName.compareTo(o.getLastName()) > 0)
                && (description.compareTo(o.getDescription()) > 0)
                && (phone.compareTo(o.getPhone()) > 0)) {
            return 1;
        }
        else if((firstName.compareTo(o.getFirstName()) < 0)
                    && (lastName.compareTo(o.getLastName()) < 0)
                    && (description.compareTo(o.getDescription()) < 0)
                    && (phone.compareTo(o.getPhone()) < 0)){
            return -1;
            }
       else {
        return 0;
       }
    }
}
