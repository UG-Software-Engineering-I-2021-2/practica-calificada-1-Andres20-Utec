
public class Main {
    public static void main(String[] args) {

        Aeropuerto chincheros = new Aeropuerto("Chincheros", "Arequipa", "Barcelona", 3000.0);
        Aeropuerto jorgeChavez = new Aeropuerto("Jorge Chavez", "Lima", "Barcelona", 4200.0);
        Aeropuerto losAngeles = new Aeropuerto("Los Angeles", "Cuzco", "Madrid", 2850.5);
        User andres = new User("76309599", "Andres", "Riveros", 2200.0);
        User andrea = new User("74561245", "Andrea" , "Guerra", 4800.0);
        User andrew = new User("68377144", "Andrew", "Lincoln", 5500.0);
        User jorge = new User("78911577", "Jorge", "Rios", 3400.0);
        Skyalert skyalert = new Skyalert();
        skyalert.addAirport(chincheros);
        skyalert.addAirport(jorgeChavez);
        skyalert.addAirport(losAngeles);
        skyalert.addUser(andrea);
        skyalert.addUser(andres);
        skyalert.addUser(andrew);
        skyalert.addUser(jorge);
    }
}
