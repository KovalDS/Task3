package ua.training;

import ua.training.Controller.Controller;
import ua.training.Model.Model;
import ua.training.View.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
