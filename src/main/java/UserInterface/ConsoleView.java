package UserInterface;

import Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {

        System.out.printf("FirstName: %s\n", value);
        System.out.println();
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {

        System.out.printf("LastName: %s\n", value);
        System.out.println();
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
        System.out.println();
    }

    @Override
    public String getPhone() {
        System.out.printf("Phone: ");
        return in.nextLine();
    }

    @Override
    public void setPhone(String value) {
        System.out.printf("Phone: %s\n", value);
        System.out.println();
    }

}
