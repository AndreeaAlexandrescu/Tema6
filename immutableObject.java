package Tema6;

public class immutableObject {

    private final String username;
    private final String firstname;
    private final String lastname;

    public immutableObject(String username, String firstname, String lastname) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getUsername() {
        return username;

    }

    public String getFirstName() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public String generateDisplayName() {
        return this.firstname + " " + this.lastname;

    }


}
