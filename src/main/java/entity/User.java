package entity;

public class User {
    private Long id;
    private String login;
    private String password;
    public static String userRegex ="#";

    public User(Long id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }
    public Long getId(){
        return id;
    }
    /*
    public void setLogin(String login){
        this.login=login;
    }
    */
    public String getLogin(){
        return login;
    }
    /*
    public void setPassword(){
        this.password=password;
    }
     */
    public String getPassword(){
        return password;
    }
    @Override
    public String toString() {
        return  id + userRegex
                + login + userRegex
                + password + userRegex;
    }
}
