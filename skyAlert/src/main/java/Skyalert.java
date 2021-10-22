import java.util.ArrayList;
import java.util.*;
public class Skyalert {
    private ArrayList<Aeropuerto> aeropuertos;
    private ArrayList<User> usuarios;
    Skyalert(){
        // nothing from here
        this.aeropuertos = new ArrayList<Aeropuerto>();
        this.usuarios = new ArrayList<User>();
    }

    public void addAirport(Aeropuerto aeropuerto) {
        this.aeropuertos.add(aeropuerto);
    }

    public void addUser(User usuario) {
        this.usuarios.add(usuario);
        this.notificar();
    }

    protected void notificar(){
        for (int i = 0; i < this.usuarios.size(); i++) {
            Aeropuerto aeropuertoBarato = this.aeropuertos.get(0);
            User viajero = this.usuarios.get(i);
            int viajesPosibles = 0;

            for (int j = 0; j < this.aeropuertos.size(); j++) {
                Aeropuerto aeropuerto1 = this.aeropuertos.get(j);
                if (aeropuerto1.getTarifa() < viajero.getPresupuesto()) {
                    System.out.println(String.format("Hola %s, el aeropuerto %s con origen: %s destino: %s está dentro de tu presupuesto", viajero.name ,aeropuerto1.getName(), aeropuerto1.getOrigen(), aeropuerto1.getDestino()));
                    viajesPosibles++;
                }
                if (aeropuertoBarato.getTarifa() > aeropuerto1.getTarifa()) {
                    aeropuertoBarato = aeropuerto1;
                }
            }
            if(viajesPosibles == 0){
                System.out.println(String.format("Hola %s aún no hemos encontrado un viaje que se encuentre dentro de tu prepuesto", viajero.name));
            }
        }
    }

    public void setTarifa(Aeropuerto aeropuerto, Double nuevaTarifa) {
        for (int i = 0; i < this.aeropuertos.size(); i++) {
            if (aeropuerto.getName() == this.aeropuertos.get(i).getName()) {
                this.aeropuertos.get(i).setTarifa(nuevaTarifa);
                break;
            }
        }
        notificar();
    }

}
