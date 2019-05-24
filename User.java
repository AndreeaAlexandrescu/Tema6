package Tema6;

public class User {

    private String username;
    private String firstname;
    private String lastname;

    public User(String username, String firstname, String lastname) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {
        this.username = username;

    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;

    }

    public String generateDisplayName() {
        return this.firstname + " " + this.lastname;

    }


}










