import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class DummySummTest {
    DummySumm ds = new DummySumm();
    @Test
    public void getSummInt() throws Exception {
        assertTrue(ds.getSummInt(1,2) == 3);
    }

}