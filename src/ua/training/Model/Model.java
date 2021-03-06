package ua.training.Model;

/**
 * Created by Dima on 09.11.2017.
 */
public class Model {
    private String surname;
    private String name;
    private String nickname;
    private String email;
    private String phone;
    private String notUniqueLogin = "notUnique";
    private String NotUniqueEmail = "notUnique@mail.com";

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean inputIsNotUnique(String input) {
        return input.equals(notUniqueLogin) || input.equals(NotUniqueEmail);
    }

}
