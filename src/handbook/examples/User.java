package handbook.examples;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String phone;
    private String[] messages = new String[10];

    User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String[] getMessages() {
        return messages;
    }
}
