package Core.Structure;

import Core.Models.Contact;

import java.util.List;

public  interface  Catalog <T extends Contact>{
    boolean add(T contact);
    Contact getContact(int index);
    boolean remove(T contact);

}
