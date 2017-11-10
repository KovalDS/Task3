package ua.training;

import java.util.Scanner;

/**
 * Created by Dima on 09.11.2017.
 */
public class Utilities {
    private Model model;
    private View view;

    public Utilities(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String getData(Scanner sc, String regex) {
        String input = readAndCheckInput(sc, regex);
        model.setSurname(input);
        return input;
    }

    public String readAndCheckInput(Scanner sc, String regex) {
        String input;
        while(!(input = sc.next()).matches(regex)) {
            view.printMessage(View.WRONG_INPUT);
        }
        return input;
    }
}
