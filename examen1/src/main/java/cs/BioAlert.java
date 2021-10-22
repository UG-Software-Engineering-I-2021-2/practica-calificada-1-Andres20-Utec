package cs;

import java.util.Map;
import java.util.HashMap;

public class BioAlert {
    private static BioAlert instance;
    private Map<Integer, Libro> libros = new HashMap<>();
    private Map<Integer, User> suscriptores = new HashMap<>();
    private Map<User, Copia> libros_prestados = new HashMap<>();
    
    private BioAlert(){}

    public void registrarLibro(int id, Libro libro) {
        libros.put(id, libro);
    }

    public void registrarSuscriptor(Integer id, User user){
        suscriptores.put(id, user);
    }

    public static BioAlert getInstance() {
        if (instance == null) {
            instance = new BioAlert();
        }
        return instance;
    }


}
