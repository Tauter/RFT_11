/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author haran
 */
public class LengyelTamasTest {
    
     @Test
    public void OsszeadasTest(){
        int bemeno1 = 25;
        int bemeno2 = 75;
        int elvaras = 100;
	int eredmeny = LengyelTamas.osszead(bemeno1,bemeno2);
	assertEquals(elvaras, eredmeny);
	}
}
