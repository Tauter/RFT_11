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
public class ImreDominikTest {
    
     @Test
    public void OsszeadasTest(){
        int bemeno1 = 5;
        int bemeno2 = 10;
        int elvaras = 50;
	int eredmeny = ImreDominik.szorzas(bemeno1,bemeno2);
	assertEquals(elvaras, eredmeny);
    
    }
}
