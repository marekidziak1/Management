package entity;

public class User {
    private Long id;
    private String login;
    private String password;
    public User(Long id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }
    public Long getId(){
        return id;
    }
    /*
    public void serLogin(String login){
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
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
