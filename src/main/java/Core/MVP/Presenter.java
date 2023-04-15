package Core.MVP;

import Core.Models.PhoneContact;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.getFirstName());
            view.setLastName(contact.getLastName());
            view.setDescription(contact.getDescription());
            view.setPhone(contact.getPhone());
        }
    }

    public void add() {
        model.currentBook().add(
                new PhoneContact(
                        view.getFirstName(),
                        view.getLastName(),
                        view.getDescription(),
                        view.getPhone()));
    }

    public void remove() {
        PhoneContact contact = new PhoneContact(
                view.getFirstName(),
                view.getLastName(),
                view.getDescription(),
                view.getPhone());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
            view.setPhone("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            PhoneContact temp = model.currentContact();
            view.setFirstName(temp.getFirstName());
            view.setLastName(temp.getLastName());
            view.setDescription(temp.getDescription());
            view.setPhone(temp.getPhone());
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                PhoneContact contact = model.currentContact();
                view.setFirstName(contact.getFirstName());
                view.setLastName(contact.getLastName());
                view.setDescription(contact.getDescription());
                view.setPhone(contact.getPhone());
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                PhoneContact contact = model.currentContact();
                view.setFirstName(contact.getFirstName());
                view.setLastName(contact.getLastName());
                view.setDescription(contact.getDescription());
                view.setPhone(contact.getPhone());
            }
        }
    }
}

