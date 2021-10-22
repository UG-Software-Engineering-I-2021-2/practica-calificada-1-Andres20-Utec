package cs;

public class Copia {
    private String estado;
    private String id;
    private String edicion;

    Copia(String estado, String id, String edicion){
        this.estado = estado;
        this.id = id;
        this.edicion = edicion;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getId() {
        return id;
    }

}
