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
                view.printError(YOU_ENTERED, e.getData());
                view.printMessages(NOT_UNIQUE);
                e.printStackTrace(); //Remove later
            }
        }
        return input;
    }

    String getData(Scanner sc, String regex) {
        return readAndCheckInput(sc, regex);
    }

    private String readAndCheckUniqueInput(Scanner sc, String regex) throws NotUniqueDataException {
        String input = readAndCheckInput(sc, regex);
        if (model.inputIsNotUnique(input)) {
            throw new NotUniqueDataException(EXCEPTION_MESSAGE, input);
        }
        return input;
    }

    private String readAndCheckInput(Scanner sc, String regex) {
        String input;
        while(!(input = sc.next()).matches(regex)) {
            view.printMessages(WRONG_INPUT);
        }
        return input;
    }
}
