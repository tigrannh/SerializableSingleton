package Singleton;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1234545468L;

    private static volatile User instance;

    private String login;
    private String password;

    private User(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User getInstance(){
        if (instance == null){
            synchronized (User.class){
                if(instance == null){
                    instance = new User();
                }
            }
        }

        return instance;
    }

    @Serial
    protected Object readResolve(){
        return instance;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

