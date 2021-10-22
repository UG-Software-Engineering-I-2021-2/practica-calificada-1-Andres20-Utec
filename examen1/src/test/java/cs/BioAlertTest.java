package cs;
import org.junit.Assert;
import org.junit.Test;

public class BioAlertTest {

    @Test
    public void test(){
        var bioAlert = BioAlert.getInstance();
        User andres = new User("Andres", "76309512");
        Assert.assertFalse(bioAlert.lectoresMultados(andres));
    }
}
