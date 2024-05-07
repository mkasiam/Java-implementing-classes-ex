package hallwayLight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class HallwayLightTest {

    HallwayLight situation1, situation2, situation3;

    @BeforeEach
    void setUp() {
        situation1 = new HallwayLight();
        situation1 = new HallwayLight(0,1);
        situation2 = new HallwayLight(1,0);
        situation3 = new HallwayLight(1,1);
    }

    @Test
    void getLampStateForSituation1(){

        situation1.toggleFirstSwitch();
        assertEquals(1, situation1.getLampState());

    }

    @Test
    void getLampStateForSituation2(){

        situation2.toggleFirstSwitch();
        assertEquals(0, situation2.getLampState());

    }

    @Test
    void getLampStateForSituation3(){

        situation3.toggleSecondSwitch();

        assertEquals(1, situation3.getLampState());

    }
}