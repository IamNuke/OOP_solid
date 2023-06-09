package UserInterface;

import Core.Config;
import Core.MVP.Presenter;
import Core.MVP.View;

import java.util.Scanner;

public class AppMenu {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next  3 - exit");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":

                        return;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
