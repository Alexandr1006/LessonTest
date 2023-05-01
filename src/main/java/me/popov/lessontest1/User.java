package me.popov.lessontest1;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    private static String char1 = "@";
    private static String char2 = ".";

    public User() {
    }

    public User(String login, String email) {
        validateUserNameEmail(login, email);
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        validateName(login);
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }
    public void validateName(String login){
        if(login == null){
            throw new IllegalArgumentException("Не корректный логин");
        }
    }
    public void validateEmail(String email){
        if (!email.contains(char1) || !email.contains(char2) || email == null){
            throw new IllegalArgumentException("Не корректный email");
        }
    }
    public void validateUserNameEmail(String login, String email){
        validateName(login);
        validateEmail(email);
        if(login.equals(email)){
            throw new IllegalArgumentException("Email is the same as name");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
