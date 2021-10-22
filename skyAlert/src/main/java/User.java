public class User {
    protected String dni;
    protected String name;
    protected String lastName;
    private Double presupuesto;

    User(String dni, String name, String lastName, Double presupuesto) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
}
