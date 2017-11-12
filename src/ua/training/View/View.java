package ua.training.View;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Dima on 09.11.2017.
 */
public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printMessages(String... message) {
        for (String v : message) {
            System.out.print(bundle.getString(v) + " ");
        }
    }

    public void printInput(String input, String... message) {
        printMessages(message);
        System.out.println(input);
    }
}
