import junit.framework.TestCase;
import org.junit.Test;

public class TimeCalTest extends TestCase {
    TimeCal tc = new TimeCal();
    @Test
    public void testCalculateTime() {
        assertEquals(1.0, tc.calculateTime(100,100));
    }
}