package ua.training.Controller;

import ua.training.Model;
import ua.training.View;

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

    String getData(Scanner sc, String regex) {
        String input = readAndCheckInput(sc, regex);
        model.setSurname(input);
        return input;
    }

    private String readAndCheckInput(Scanner sc, String regex) {
        String input;
        while(!(input = sc.next()).matches(regex)) {
            view.printMessage(View.WRONG_INPUT);
        }
        return input;
    }
}
