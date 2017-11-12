package ua.training.Controller;

import ua.training.Model.Model;
import ua.training.View.View;

import java.util.Scanner;

/**
 * Created by Dima on 09.11.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputReader inputReader = new InputReader(model, view);
        inputReader.proccessInput(sc);
    }
}
