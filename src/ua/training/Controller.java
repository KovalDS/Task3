package ua.training;

import java.util.Scanner;

/**
 * Created by Dima on 09.11.2017.
 */
public class Controller {
    public static final String REGEX_SURNAME = "^[A-Z][a-z]+$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+$";
    public static final String REGEX_NICKNAME = "^[A-Za-z0-9_-]{3,12}$";
    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+@[a-z]{2,6}.[a-z]{2,5}$";
    public static final String REGEX_PHONE = "^0[0-9]{9}$";

    private Model model;
    private View view;

    private Utilities utilities;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        utilities = new Utilities(model, view);
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

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
