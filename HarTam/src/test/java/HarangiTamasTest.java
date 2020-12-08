
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author haran
 */
public class HarangiTamasTest {
    
    public HarangiTamasTest() {
    }
    @Test
    public void HosszTeszt1(){
        String bemeno = "Ez egy szoveg";
        int elvaras = 13;
	int eredmeny = HarangiTamasClass.szovegHossz(bemeno);
	assertEquals(elvaras, eredmeny);
	}
    }
