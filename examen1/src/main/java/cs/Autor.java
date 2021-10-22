package cs;

public class Autor {
    private String nombre;
    private String fechaDeNacimiento;

    Autor(String nombre, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
