package ua.training.Controller;

import ua.training.Model;
import ua.training.View;

import java.util.Scanner;

import static ua.training.Controller.RegexContainer.*;

public class InputReader {
    private Model model;
    private View view;
    private Utilities utilities;

    InputReader(Model model, View view) {
        this.model = model;
        this.view = view;
        this.utilities = new Utilities(model, view);
    }

    void proccessInput(Scanner sc) {
        String input = utilities.getData(sc, REGEX_SURNAME);
        view.printMessage(input);

        input = utilities.getData(sc, REGEX_NAME);
        view.printMessage(input);

        input = utilities.getData(sc, REGEX_NICKNAME);
        view.printMessage(input);

        input = utilities.getData(sc, REGEX_EMAIL);
        view.printMessage(input);

        input = utilities.getData(sc, REGEX_PHONE);
        view.printMessage(input);
    }
}
