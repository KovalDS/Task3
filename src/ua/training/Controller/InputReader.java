package ua.training.Controller;

import ua.training.Model.Model;
import ua.training.View.View;

import java.util.Scanner;

import static ua.training.Controller.RegexContainer.*;
import static ua.training.View.TextConstants.*;

class InputReader {
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
        model.setSurname(utilities.getData(sc, REGEX_SURNAME));
        view.printInput(model.getSurname(), YOUR, SURNAME);

        view.printMessages(INPUT_DATA, NAME);
        model.setName(utilities.getData(sc, REGEX_NAME));
        view.printInput(model.getName(), YOUR, NAME);

        view.printMessages(INPUT_DATA, NICKNAME);
        model.setNickname(utilities.getUniqueData(sc, REGEX_NICKNAME));
        view.printInput(model.getNickname(), YOUR, NICKNAME);

        view.printMessages(INPUT_DATA, EMAIL);
        model.setEmail(utilities.getUniqueData(sc, REGEX_EMAIL));
        view.printInput(model.getEmail(), YOUR, EMAIL);

        view.printMessages(INPUT_DATA, PHONE, PHONE_FORMAT);
        model.setPhone(utilities.getData(sc, REGEX_PHONE));
        view.printInput(model.getPhone(), YOUR, PHONE);
    }
}
