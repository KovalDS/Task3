package ua.training.Controller;

public interface RegexContainer {
    String REGEX_SURNAME = "^[A-Z][a-z]+$";
    String REGEX_NAME = "^[A-Z][a-z]+$";
    String REGEX_NICKNAME = "^[A-Za-z0-9_-]{3,15}$";
    String REGEX_EMAIL = "^[A-Za-z0-9]+@[a-z]{2,6}.[a-z]{2,5}$";
    String REGEX_PHONE = "^0[0-9]{9}$";
}
