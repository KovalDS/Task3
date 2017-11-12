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
        model.setSurname(input);
        view.printInput(model.getSurname(), YOUR, SURNAME);

        view.printMessages(INPUT_DATA, NAME);
        input = utilities.getData(sc, REGEX_NAME);
        model.setName(input);
        view.printInput(model.getName(), YOUR, NAME);

        view.printMessages(INPUT_DATA, NICKNAME);
        input = utilities.getUniqueData(sc, REGEX_NICKNAME);
        model.setNickname(input);
        view.printInput(model.getNickname(), YOUR, NICKNAME);

        view.printMessages(INPUT_DATA, EMAIL);
        input = utilities.getUniqueData(sc, REGEX_EMAIL);
        model.setEmail(input);
        view.printInput(model.getEmail(), YOUR, EMAIL);

        view.printMessages(INPUT_DATA, PHONE, PHONE_FORMAT);
        input = utilities.getData(sc, REGEX_PHONE);
        model.setPhone(input);
        view.printInput(model.getPhone(), YOUR, PHONE);
    }
}
