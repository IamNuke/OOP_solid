package Core.Structure;

import Core.Models.Contact;

import java.util.List;

public interface IGetContacts <E extends Contact>{
    public List<E> getContacts();
}
