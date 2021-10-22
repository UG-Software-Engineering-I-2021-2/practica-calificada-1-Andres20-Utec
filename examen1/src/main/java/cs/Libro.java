package cs;
import java.util.*;
public class Libro{
    private String an_o;
    private String nombre;
    private Autor autor;
    private ArrayList<Copia> copias = new ArrayList<>();
    Libro(String an_o, String nombre, Autor autor){
        this.an_o = an_o;
        this.nombre = nombre;
        this.autor = autor;
    }

    public void addCopia(Copia copia) {
        this.copias.add(copia);
    }

}
