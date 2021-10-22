public class Aeropuerto {
    protected String origen;
    protected String destino;
    protected Double tarifa;
    protected String name;
    Aeropuerto(String name, String origen, String destino, Double tarifa){
        this.origen = origen;
        this.destino = destino;
        this.tarifa = tarifa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
