package ua.training.Controller;

import ua.training.Model.Model;
import ua.training.View.View;

import java.util.Scanner;

import static ua.training.Controller.RegexContainer.*;
import static ua.training.View.TextConstants.*;

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
        view.printMessages(INPUT_DATA, SURNAME);
        String input = utilities.getData(sc, REGEX_SURNAME);
        view.printInput(input, YOUR, SURNAME);

        view.printMessages(INPUT_DATA, NAME);
        input = utilities.getData(sc, REGEX_NAME);
        view.printInput(input, YOUR, NAME);

        view.printMessages(INPUT_DATA, NICKNAME);
        input = utilities.getData(sc, REGEX_NICKNAME);
        view.printInput(input, YOUR, NICKNAME);

        view.printMessages(INPUT_DATA, EMAIL);
        input = utilities.getData(sc, REGEX_EMAIL);
        view.printInput(input, YOUR, EMAIL);

        view.printMessages(INPUT_DATA, PHONE, PHONE_FORMAT);
        input = utilities.getData(sc, REGEX_PHONE);
        view.printInput(input, YOUR, PHONE);
    }
}
