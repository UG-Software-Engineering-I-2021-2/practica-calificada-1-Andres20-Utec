package cs;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class BioAlert {
    private static BioAlert instance;
    private Map<Integer, Libro> libros = new HashMap<>();
    private Map<User, String> suscriptores = new HashMap<>();
    private Map<String, Boolean> multados = new HashMap<>();

    private BioAlert(){

    }

    public void registrarLibro(int id, Libro libro) {
        libros.put(id, libro);
    }

    public void registrarSuscriptor(User user, String tituloDelLibro){
        suscriptores.put(user, tituloDelLibro);
    }

    private void agregarLectoresMultados(User user) {
        multados.put(user.getDni(), true);
    }

    public boolean notificarSuscriptores(){

        return true;
    }

    public Boolean lectoresMultados(User user) {
        return this.multados.get(user.getDni()) != null;
    }

    public static BioAlert getInstance() {
        if (instance == null) {
            instance = new BioAlert();
        }
        return instance;
    }



}
