package ua.training.Controller;

import ua.training.Model.Model;
import ua.training.Model.NotUniqueDataException;
import static ua.training.View.TextConstants.*;
import ua.training.View.View;

import java.util.Scanner;



/**
 * Created by Dima on 09.11.2017.
 */
class Utilities {
    private Model model;
    private View view;

    Utilities(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    String getUniqueData(Scanner sc, String regex) {
        String input = null;
        while (input == null) {
            try {
                input = readAndCheckUniqueInput(sc, regex);
            } catch (NotUniqueDataException e) {
                view.printMessage(NOT_UNIQUE);
            }
        }
        return input;
    }

    String getData(Scanner sc, String regex) {
        String input = readAndCheckInput(sc, regex);
        return input;
    }

    private String readAndCheckUniqueInput(Scanner sc, String regex) throws NotUniqueDataException {
        String input;
        while(!(input = sc.next()).matches(regex)) {
            view.printMessage(WRONG_INPUT);
        }
        if (model.inputIsUnique(input)) {
            throw new NotUniqueDataException();
        }
        return input;
    }

    private String readAndCheckInput(Scanner sc, String regex) {
        String input;
        while(!(input = sc.next()).matches(regex)) {
            view.printMessage(WRONG_INPUT);
        }
        return input;
    }
}
