package cs;

public class User {
    private final String name;
    private final String Dni;
    private int numeroLibrosPrestados;
    private int[] dias;
    User(String name, String Dni){
        this.name = name;
        this.Dni = Dni;
        this.numeroLibrosPrestados = 0;
    }

    public String getDni() {
        return this.Dni;
    }

    public boolean addNumeroLibrosPrestados(){
        if(this.numeroLibrosPrestados == 3) {
            return false;
        }
        this.numeroLibrosPrestados +=1;
        return true;
    }

    public void devolverLibro() {
        if (numeroLibrosPrestados >0) {
            this.numeroLibrosPrestados -= 1;
        }
    }
}
