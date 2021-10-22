package cs;

public class User {
    private final String name;
    private final String Dni;
    User(String name, String Dni){
        this.name = name;
        this.Dni = Dni;
    }

    public String getDni() {
        return this.Dni;
    }
}
